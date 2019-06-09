package cn.jcorn.wrap;

import cn.jcorn.starter.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WrapApplication {

    public static void main(String[] args) {
        SpringApplication.run(WrapApplication.class, args);
    }

    @Autowired
    private ExampleService exampleService;

    @GetMapping("/input")
    public String input(String word) {
        return exampleService.wrap(word);
    }

}
