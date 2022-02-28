package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    // 주세요~ Read - Select
    @GetMapping("/user")
    public String test1() {
        return "<h1>test1</h1>";
    }

    // 줄게요 Creat - Insert
    @PostMapping("/user")
    public String test2() {
        return "<h1>test2</h1>";
    }

    // 수정해주세요 Update - Update
    @PutMapping("/user")
    public String test3() {
        // 수정코드
        return "<h1>test3</h1>"; // 수정잘했어 하고 보여줌
    }

    // 삭제해주세요 Delete - Delete
    @DeleteMapping("/user")
    public String test4() {
        return "<h1>test4</h1>";
    }
}
