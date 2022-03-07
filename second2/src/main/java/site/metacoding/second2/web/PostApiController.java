package site.metacoding.second2.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostApiController {

    @GetMapping("/post/{id}")
    public String post1(@PathVariable int id) {
        return "주세요" + id;
    }

    @GetMapping("/post}")
    public String serch(String title) {
        return "주세요" + title;
    }

    @PostMapping("/post")
    public String post2(String title, String content) {
        return "post2" + title + content;
    }

    @PutMapping("/post/{id}")
    public String post3(String title, String content, @PathVariable int id) {
        return "post3" + title + content + id;
    }

    @DeleteMapping("/post/{id}")
    public String post4(@PathVariable int id) {
        return "post4" + id;
    }

    @DeleteMapping("/post")
    public String post44(String title) {
        return "post4";
    }

}
