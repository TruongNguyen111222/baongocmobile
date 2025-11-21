package com.web.dto.request.request;

public record DiagnosisFeeUpdateRequest(
        String errorDiagnosis,
        Integer fee
) {}