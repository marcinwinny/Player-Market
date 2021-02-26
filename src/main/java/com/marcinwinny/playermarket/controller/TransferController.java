package com.marcinwinny.playermarket.controller;

import com.marcinwinny.playermarket.dto.PlayerDto;
import com.marcinwinny.playermarket.dto.TransferDto;
import com.marcinwinny.playermarket.model.Transfer;
import com.marcinwinny.playermarket.service.TransferService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/transfers/")
public class TransferController {

    private final TransferService transferService;

    @PostMapping
    public ResponseEntity<Void> createTransfer(@RequestBody TransferDto transferDto) {
        transferService.insert(transferDto);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<TransferDto>> getAllTransfers() {
        return ResponseEntity.status(HttpStatus.OK).body(transferService.getAll());
    }

//    @GetMapping("/by-id/{id}")
//    public ResponseEntity<TransferDto> getTransferById(@RequestParam Long id) {
//        return ResponseEntity.status(HttpStatus.OK).body(transferService.getTransferById(id));
//    }
//
//    @DeleteMapping("/by-id/{id}")
//    public ResponseEntity deleteTransfer(@PathVariable Long id) {
//        transferService.deleteTransfer(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
