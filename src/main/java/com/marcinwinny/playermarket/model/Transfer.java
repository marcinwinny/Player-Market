package com.marcinwinny.playermarket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "transfers")
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transferId;

    @NotBlank
    @ManyToOne
    @JoinColumn(name = "playerId", referencedColumnName = "playerId")
    private Player player;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @NotBlank(message = "Transfer from is required")
//    private Team from;

    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "teamId", referencedColumnName = "teamId")
    @NotBlank(message = "Transfer to is required")
    private Team to;

    @NotBlank
    private Integer transferFee;
//    @NotBlank(message = "Date is required")
//    private LocalDate date;
}
