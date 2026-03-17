package com.sds.mes.dto;

import jakarta.validation.constraints.*;

public class LotUpdateRequest {

    @NotBlank(message = "lotId는 필수 입력값입니다.")
    @Pattern(
        regexp = "^[A-Za-z0-9_-]{1,50}$",
        message = "lotId는 영문, 숫자, 하이픈, 언더스코어만 허용되며 50자 이내여야 합니다."
    )
    private String lotId;

    @NotNull(message = "quantity는 필수 입력값입니다.")
    @Min(value = 0, message = "quantity는 0 이상이어야 합니다.")
    @Max(value = 9999999, message = "quantity는 9,999,999 이하여야 합니다.")
    private Integer quantity;

    @NotBlank(message = "status는 필수 입력값입니다.")
    @Pattern(
        regexp = "^(ACTIVE|HOLD|CLOSED|SCRAPPED)$",
        message = "status는 ACTIVE, HOLD, CLOSED, SCRAPPED 중 하나여야 합니다."
    )
    private String status;

    @Size(max = 200, message = "remark는 200자 이내여야 합니다.")
    @Pattern(
        regexp = "^[^<>\"';&]*$",
        message = "remark에 허용되지 않는 특수문자가 포함되어 있습니다."
    )
    private String remark;

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
