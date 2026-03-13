package com.sds.mes.common;

import java.time.LocalDateTime;
import java.util.List;

public class ApiResponse<T> {

    private boolean success;
    private String message;
    private T data;
    private List<FieldError> errors;
    private LocalDateTime timestamp;

    private ApiResponse() {
        this.timestamp = LocalDateTime.now();
    }

    public static <T> ApiResponse<T> success(String message, T data) {
        ApiResponse<T> response = new ApiResponse<>();
        response.success = true;
        response.message = message;
        response.data = data;
        return response;
    }

    public static ApiResponse<Void> error(String message, List<FieldError> errors) {
        ApiResponse<Void> response = new ApiResponse<>();
        response.success = false;
        response.message = message;
        response.errors = errors;
        return response;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public List<FieldError> getErrors() {
        return errors;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public static class FieldError {
        private String field;
        private String rejectedValue;
        private String reason;

        public FieldError(String field, Object rejectedValue, String reason) {
            this.field = field;
            this.rejectedValue = rejectedValue != null ? rejectedValue.toString() : null;
            this.reason = reason;
        }

        public String getField() {
            return field;
        }

        public String getRejectedValue() {
            return rejectedValue;
        }

        public String getReason() {
            return reason;
        }
    }
}
