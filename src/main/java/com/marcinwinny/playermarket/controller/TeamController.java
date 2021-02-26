package com.marcinwinny.playermarket.controller;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.dto.TeamDto;
import com.marcinwinny.playermarket.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/teams/")
public class TeamController {

    private final TeamService teamService;

    @PostMapping
    public ResponseEntity createTeam(@RequestBody TeamDto teamDto) {
        teamService.insert(teamDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/update")
    public ResponseEntity updateTeam(@RequestBody TeamDto teamDto) {
        teamService.update(teamDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<TeamDto>> getAllTeams() {
        return ResponseEntity.status(HttpStatus.OK).body(teamService.getAll());
    }

    @GetMapping("/by-id/{id}")
    public ResponseEntity<TeamDto> getTeamById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(teamService.getByTeamId(id));
    }

    @GetMapping("/by-country/{country}")
    public ResponseEntity<List<TeamDto>> getAllTeamsByCountry(@PathVariable String country) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(teamService.getAllByCountry(country));
    }

    @GetMapping("/players/{id}")
    public ResponseEntity<List<PlayerDto>> getAllTeamPlayersByTeamId(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .body(teamService.getAllTeamPlayers(id));
    }

    @DeleteMapping("/by-id/{id}")
    public ResponseEntity deleteTeam(Long id) {
        teamService.deleteTeam(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }



}
