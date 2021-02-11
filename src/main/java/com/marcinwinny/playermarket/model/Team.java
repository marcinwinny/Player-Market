package com.marcinwinny.playermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamId;

    @Column(unique = true)
    @NotBlank(message = "Team name is required")
    private String teamName;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Country is requires")
    private Country country;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Player> players;
}
