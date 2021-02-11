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
public class Transfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotBlank(message = "Transfer from is required")
//    private Team from;
//    @NotBlank(message = "Transfer to is required")
//    private Team to;
    private Integer transferFee;
    @NotBlank(message = "Date is required")
    private LocalDate date;
}
