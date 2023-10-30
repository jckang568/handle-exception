package kr.co.jckang.handleexception.api.controller;

import kr.co.jckang.handleexception.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/product/{id}")
    public ResponseEntity<String> getProduct(@PathVariable String id){
        log.info("info test");
        return productService.getProduct(id);
    }
}