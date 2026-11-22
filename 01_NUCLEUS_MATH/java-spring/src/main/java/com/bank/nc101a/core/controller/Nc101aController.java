package com.bank.nc101a.core.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.bank.nc101a.core.service.Nc101aService;

/**
 * REST API Controller for NC101A
 */
@RestController
@RequestMapping("/api/v1/nc101a")
@Slf4j
@RequiredArgsConstructor
public class Nc101aController {

    private final Nc101aService nc101aService;

    @PostMapping("/execute")
    public ResponseEntity<Nc101aService.ReturnCodeResponse> execute(
            @RequestBody(required = false) Nc101aService.ProgramState requestState) {
        log.info("Executing NC101A");
        return ResponseEntity.ok(nc101aService.execute(requestState));
    }
}
