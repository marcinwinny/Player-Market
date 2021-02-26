package com.marcinwinny.playermarket.mapper;

import com.marcinwinny.playermarket.dto.TransferDto;
import com.marcinwinny.playermarket.model.Player;
import com.marcinwinny.playermarket.model.Team;
import com.marcinwinny.playermarket.model.Transfer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TransferMapper {

    @Mapping(target = "transferId", ignore = true)
//    @Mapping(target = "from", source = "from")
    @Mapping(target = "to", source = "to")
    @Mapping(target = "player", source = "player")
    Transfer mapDtoToTransfer(TransferDto transferDto, Team to, Player player);

    @Mapping(target = "playerId", expression = "java(transfer.getPlayer().getPlayerId())")
//    @Mapping(target = "from", expression = "java(transfer.getFrom().getTeamName())")
    @Mapping(target = "to", expression = "java(transfer.getTo().getTeamName())")
    TransferDto mapTransferToDto(Transfer transfer);
}
