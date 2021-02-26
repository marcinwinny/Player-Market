package com.marcinwinny.playermarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long playerId;

    @NotBlank(message = "Player name is required")
    private String playerName;

    @DateTimeFormat
    @NotBlank(message = "Date of birth is required")
    private LocalDate dateOfBirth;

    @NotBlank(message = "Place of birth is required")
    private String placeOfBirth;

    @NotBlank(message = "Height is required")
    private Integer height;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Country is required")
    private Country country;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Position is required")
    private PlayerPosition position;

    @Enumerated(EnumType.STRING)
    @NotBlank(message = "Foot is required")
    private Foot foot;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teamId", referencedColumnName = "teamId")
    private Team team;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Transfer> transfers;

    //calculate age better
    public Integer calculateAge() {
        return LocalDate.now()
                .minusYears(getDateOfBirth().getYear())
                .getYear();
    }


}
