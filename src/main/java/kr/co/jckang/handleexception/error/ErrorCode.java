package kr.co.jckang.handleexception.error;

import org.springframework.http.HttpStatus;

public interface ErrorResponse {
    String name();
    HttpStatus getHttpStatus();
    String getMessage();
}
