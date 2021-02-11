package com.marcinwinny.playermarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeamDto {

    private Long teamId;
    private String teamName;
    private String country;
    private Integer numberOfPlayers;

    private String averageAge;
    private Integer foreigners;
    private String foreignersPercent;

    public TeamDto(String teamName, String country) {
        this.teamName = teamName;
        this.country = country;
    }
}
