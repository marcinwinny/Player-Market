package com.marcinwinny.playermarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDto {

    private Long id;
    private String playerName;
    private String dateOfBirth;
    private String placeOfBirth;
    private Integer height;
    private String country;
    private String position;
    private String foot;
    private String team;

    private Integer age;

    public PlayerDto(String playerName, String dateOfBirth, String placeOfBirth, Integer height, String country,
                     String position, String foot, String team) {
        this.playerName = playerName;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.height = height;
        this.country = country;
        this.position = position;
        this.foot = foot;
        this.team = team;
    }
}
