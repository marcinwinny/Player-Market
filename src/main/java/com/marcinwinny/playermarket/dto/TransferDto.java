package com.marcinwinny.playermarket.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransferDto {

    private Long transferId;
    private Long playerId;
//    private String from;
    private String to;
    private Integer transferFee;
//    private String date;

}
