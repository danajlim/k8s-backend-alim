package com.welab.k8s_backend_alim.common.exception;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

public class BadParameter extends ClientError{
    public BadParameter(String message) {
        this.errorCode = "BadParameter";
        this.errorMessage = message;
    }
}
