package com.techzen.techlearn.util;

import com.techzen.techlearn.dto.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class JsonResponse {
    public static <T> ResponseEntity<ApiResponse<T>> ok(T data) {
        return ResponseEntity.ok(ApiResponse.<T>builder().data(data).build());
    }

    public static <T> ResponseEntity<ApiResponse<T>> created(T data) {
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponse.<T>builder().data(data).build());
    }

    public static <T> ResponseEntity<ApiResponse<T>> deleted() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}