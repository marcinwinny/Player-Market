package com.marcinwinny.playermarket.mapper;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.model.*;
import org.apache.tomcat.jni.Local;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.LocalDate;
import java.time.Period;

@Mapper(componentModel = "spring")
public interface PlayerMapper
{
    @Mapping(target = "country", source = "playerDto.country")
    @Mapping(target = "team", source = "team")
    @Mapping(target = "transfers", ignore = true)
    Player mapDtoToPlayer(PlayerDto playerDto, Team team);

    @Mapping(target = "age", expression = "java(mapAge(player.getDateOfBirth()))")
    @Mapping(target = "team", expression = "java(player.getTeam().getTeamName())")
    PlayerDto mapPlayerToDto(Player player);

    default Integer mapAge(LocalDate dateOfBirth) {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }

//    @Mapping(target = "country", expression = "java(mapCountryToUpperCase(playerDto.getCountry()))")
//
//    default String mapCountryToUpperCase(String country) {
//        return country.toUpperCase();
//    }
}
