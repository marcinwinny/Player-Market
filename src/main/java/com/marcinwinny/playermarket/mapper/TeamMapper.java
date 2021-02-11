package com.marcinwinny.playermarket.mapper;

import com.marcinwinny.playermarket.dto.TeamDto;
import com.marcinwinny.playermarket.model.Country;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.model.Team;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TeamMapper {

    @Mapping(target = "averageAge", expression = "java(mapAverageAge(team.getPlayers()))")
    @Mapping(target = "foreigners", expression = "java(mapForeigners(team.getPlayers(), team.getCountry()))")
    @Mapping(target = "foreignersPercent", expression = "java(mapForeignersPercent(team.getPlayers(), team.getCountry()))")
    @Mapping(target = "numberOfPlayers", expression = "java(mapPlayers(team.getPlayers()))")
    TeamDto mapTeamToDto(Team team);

    @InheritInverseConfiguration
    @Mapping(target = "players", ignore = true)
    Team mapDtoToTeam(TeamDto teamDto);

    default Integer mapPlayers(List<Player> players) {
        return players.size();
    }

    default String mapAverageAge(List<Player> players) {
        float average = (float) players.stream()
                .map(Player::calculateAge)
                .reduce(0, Integer::sum) / (float) players.size();
        return String.format("%.1f", average);
    }

    default Integer mapForeigners(List<Player> players, Country country) {
        return (int) players.stream()
                .filter(player -> !player.getCountry().equals(country))
                .count();
    }

    default String mapForeignersPercent(List<Player> players, Country country) {
        float average = 100f * (float) mapForeigners(players, country) / (float) players.size();
        return String.format("%.1f",average);
    }

}
