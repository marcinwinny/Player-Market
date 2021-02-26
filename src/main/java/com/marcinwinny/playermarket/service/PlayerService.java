package com.marcinwinny.playermarket.service;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.exception.PlayerNotFoundException;
import com.marcinwinny.playermarket.exception.TeamNotFoundException;
import com.marcinwinny.playermarket.mapper.PlayerMapper;
import com.marcinwinny.playermarket.model.*;
import com.marcinwinny.playermarket.repository.PlayerRepository;
import com.marcinwinny.playermarket.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Transactional
public class PlayerService {

    private final PlayerRepository playerRepository;
    private final PlayerMapper playerMapper;
    private final TeamRepository teamRepository;

    public void insert(PlayerDto playerDto) {
        Team team = teamRepository.findByTeamName(playerDto.getTeam())
                .orElseThrow(() -> new TeamNotFoundException(playerDto.getTeam()));
        playerDto.setCountry(playerDto.getCountry().toUpperCase());
        Player player = playerMapper.mapDtoToPlayer(playerDto, team);
        playerRepository.save(player);
        team.getPlayers().add(player);
    }

    //TODO: implement update player with mapping
//    public void update(PlayerDto playerDto) {
//        Player player = playerRepository.findById(playerDto.getPlayerId())
//                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + playerDto.getPlayerId().toString()));
//
//    }

    public PlayerDto getPlayerById(Long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + id.toString()));
        return playerMapper.mapPlayerToDto(player);
    }

    public List<PlayerDto> getAll() {
        return playerRepository.findAll()
                .stream()
                .map(playerMapper::mapPlayerToDto)
                .collect(Collectors.toList());
    }

    public void deletePlayer(Long id) {
        Player player = playerRepository.findById(id)
                .orElseThrow(() -> new PlayerNotFoundException("Player not found with id: " + id.toString()));
        Team team = teamRepository.findByTeamName(player.getTeam().getTeamName())
                .orElseThrow(() -> new TeamNotFoundException(player.getTeam().getTeamName()));
        team.getPlayers().remove(player);
        playerRepository.delete(player);
    }

    public void deleteAll() {
        playerRepository.deleteAll();
    }
}
