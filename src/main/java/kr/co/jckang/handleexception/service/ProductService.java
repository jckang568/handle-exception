package kr.co.jckang.handleexception.service;

import org.springframework.boot.context.config.InactiveConfigDataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerExceptionResolver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLException;

@Service
public class ProductService {

    public ResponseEntity<String> getProduct(String id) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println();


        int result = Integer.parseInt(id);
        if (result > 0) {
            return ResponseEntity.ok("bigger than zero");
        }
        return ResponseEntity.ok("smaller than zero");
    }
}
