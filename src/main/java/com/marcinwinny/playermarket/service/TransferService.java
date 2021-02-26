package com.marcinwinny.playermarket.service;

import com.marcinwinny.playermarket.dto.TransferDto;
import com.marcinwinny.playermarket.exception.PlayerNotFoundException;
import com.marcinwinny.playermarket.exception.TeamNotFoundException;
import com.marcinwinny.playermarket.mapper.TransferMapper;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.model.Team;
import com.marcinwinny.playermarket.model.Transfer;
import com.marcinwinny.playermarket.repository.PlayerRepository;
import com.marcinwinny.playermarket.repository.TeamRepository;
import com.marcinwinny.playermarket.repository.TransferRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
@AllArgsConstructor
public class TransferService {

    private final TeamRepository teamRepository;
    private final TransferRepository transferRepository;
    private final PlayerRepository playerRepository;
    private final TransferMapper transferMapper;

    @Transactional
    public void insert(TransferDto transferDto) {
        Team teamTo = teamRepository.findByTeamName(transferDto.getTo())
                .orElseThrow(() -> new TeamNotFoundException("Team not found"));
        Player player = playerRepository.findById(transferDto.getPlayerId())
                .orElseThrow(() -> new PlayerNotFoundException("Player not found"));

        Transfer transfer = transferMapper.mapDtoToTransfer(transferDto, teamTo, player);

        //remove player from one team and add to another
        player.getTeam().getPlayers().remove(player);
        teamTo.getPlayers().add(player);

        //change player current team and add transfer to transfers list
        player.setTeam(teamTo);
        player.getTransfers().add(transfer);

        playerRepository.save(player);
        transferRepository.save(transfer);

    }

    public List<TransferDto> getAll() {
        return transferRepository.findAll()
                .stream()
                .map(transferMapper::mapTransferToDto)
                .collect(Collectors.toList());
    }
}
