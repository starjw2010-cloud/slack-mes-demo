package com.sds.mes.controller;

import com.sds.mes.common.ApiResponse;
import com.sds.mes.dto.LotUpdateRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lot")
public class LotController {

    @PostMapping("/update")
    public ResponseEntity<ApiResponse<String>> updateLot(
            @Valid @RequestBody LotUpdateRequest request) {

        // TODO: LotService.update(request) 호출 로직 추가
        return ResponseEntity.ok(ApiResponse.success("Lot 업데이트가 완료되었습니다.", request.getLotId()));
    }
}
