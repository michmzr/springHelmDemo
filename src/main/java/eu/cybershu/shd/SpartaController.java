package eu.cybershu.shd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SpartaController {
    private final String hello;

    public SpartaController(@Value("${config.hello:sad,sad sparta}") String hello) {
        this.hello = hello;
    }

    @GetMapping("hello")
    public String hello() {
        return hello;
    }
}
