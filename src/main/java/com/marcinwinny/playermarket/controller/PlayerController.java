package com.marcinwinny.playermarket.controller;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.service.PlayerService;
import com.marcinwinny.playermarket.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/players/")
public class PlayerController {

    private final PlayerService playerService;
    private final TeamService teamService;

    @PostMapping
    public ResponseEntity<Void> createPlayer(@RequestBody PlayerDto playerDto) {
        playerService.insert(playerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/list")
    public ResponseEntity<Void> createMultiplePlayers(@RequestBody List<PlayerDto> playerDtoList) {
        playerDtoList.stream().forEach(playerDto -> playerService.insert(playerDto));
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PlayerDto>> getAllPlayers(){
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getAll());
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity<PlayerDto> getPlayerById(@RequestParam Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(playerService.getPlayerById(id));
    }

    @DeleteMapping("/by-id/{id}")
    public ResponseEntity deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
