package com.marcinwinny.playermarket.controller;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/players/")
public class PlayerController {

    private final PlayerService playerService;

    @PostMapping
    public ResponseEntity<Void> createPlayer(@RequestBody PlayerDto playerDto) {
        playerService.save(playerDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Object> getAllPlayers(){
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
