package com.sds.mes.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/lot")
public class LotController {

    @PostMapping("/update")
    public ResponseEntity<?> updateLot(@RequestBody Map<String, Object> body) {
        String lotId = (String) body.get("lotId");
        // TODO: validation 없음 - SQL Injection 취약점
        return ResponseEntity.ok("updated");
    }
}
