package kr.co.jckang.handleexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HandleExceptionApplication {

    public static void main(String[] args) {
        SpringApplication.run(HandleExceptionApplication.class, args);
    }

}
