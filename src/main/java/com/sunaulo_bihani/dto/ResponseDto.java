package com.sunaulo_bihani.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Slf4j
public class ResponseDto {
    private Object data;
    private List<Object> errors;
    private Map<String, Object> meta = new HashMap<>();

    public ResponseDto addMeta(String key, Object value) {
        try {
            HashMap<String, Object> copyMap = new HashMap<>(this.meta);
            copyMap.put(key, value);
            this.setMeta(copyMap);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return this;
    }

    public ResponseDto(Object data) {
        this.data = data;
    }

    public void addError(Object error) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(error);
    }
}

