package kr.co.jckang.handleexception.api.controller;

import kr.co.jckang.handleexception.api.dto.User;
import kr.co.jckang.handleexception.error.UserErrorCode;
import kr.co.jckang.handleexception.exception.RestApiException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUser() {
        throw new RestApiException(UserErrorCode.INACTIVE_USER);
    }
}
