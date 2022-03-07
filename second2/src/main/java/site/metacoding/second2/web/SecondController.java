package site.metacoding.second2.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    @GetMapping("/test")
    public String test1() {
        return "test1";
    }

    @PostMapping("/test")
    public String test2() {
        return "test2";
    }

    @PutMapping("/test")
    public String test3() {
        return "test3";
    }

    @DeleteMapping("/test")
    public String test4() {
        return "test4";
    }
}
