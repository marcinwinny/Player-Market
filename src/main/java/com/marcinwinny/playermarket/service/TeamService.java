package com.marcinwinny.playermarket.service;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.dto.TeamDto;
import com.marcinwinny.playermarket.exception.TeamNotFoundException;
import com.marcinwinny.playermarket.mapper.PlayerMapper;
import com.marcinwinny.playermarket.mapper.TeamMapper;
import com.marcinwinny.playermarket.model.Country;
import com.marcinwinny.playermarket.model.Team;
import com.marcinwinny.playermarket.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class TeamService {

    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;
    private final PlayerMapper playerMapper;

    public void insert(TeamDto teamDto) {
        teamRepository.save(teamMapper.mapDtoToTeam(teamDto));
    }

    public void update(TeamDto teamDto) {
        Team team = teamRepository.findById(teamDto.getTeamId())
                .orElseThrow(() -> new TeamNotFoundException("Not found team with id: " + teamDto.getTeamId().toString()));
        if (teamDto.getTeamName() != null) {
            team.setTeamName(teamDto.getTeamName());
        }
        if (teamDto.getCountry() != null) {
            team.setCountry(Country.valueOf(teamDto.getCountry().toUpperCase()));
        }
        teamRepository.save(team);
    }

    @Transactional(readOnly = true)
    public List<TeamDto> getAll() {
        return teamRepository.findAll()
                .stream()
                .map(teamMapper::mapTeamToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<TeamDto> getAllByCountry(String country) {
        return teamRepository.findByCountry(Country.valueOf(country.toUpperCase()))
                .stream()
                .map(teamMapper::mapTeamToDto)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public TeamDto getByName(String name) {
        Team team = teamRepository.findByTeamName(name)
                .orElseThrow(() -> new TeamNotFoundException("Not found team with name: " + name));
        return teamMapper.mapTeamToDto(team);
    }

    public void deleteTeam(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException("Not found team with id: " + id.toString()));
        teamRepository.delete(team);
    }

    @Transactional(readOnly = true)
    public TeamDto getByTeamId(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException("Not found team with id: " + id.toString()));
        return teamMapper.mapTeamToDto(team);
    }

    public List<PlayerDto> getAllTeamPlayers(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new TeamNotFoundException("Not found team with id: " + id.toString()));
        return team.getPlayers().stream()
                .map(playerMapper::mapPlayerToDto)
                .collect(Collectors.toList());
    }

    public void deleteAll() {
        teamRepository.deleteAll();
    }

}
