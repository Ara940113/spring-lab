package site.metacoding.second.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    // selcet * from post where id =?
    // 구체적으로 뭘 달라고 요청해야한다. - body x
    @GetMapping("/post/{id}") // 테이블 명 / 프라이머리키 , 중괄호를 쓰면 PathVariable , id는 프라이머리키 세계약속
    public String post1(@PathVariable int id) {
        return "<h1>주세요 id :  </h1>" + id;
    }

    // selcet * from post where title =?
    // 구체적으로 뭘 달라고 요청해야한다. - body x
    // http://localhost:9000/post?title=?
    /// http헤더에 닮겨서 간다
    @GetMapping("/post") // 프라이머리키가 아닌건 쿼리스트링을 쓰지만 프레임워크에서는 쿼리스트링을 쓰지 않아도 된다.
    public String search(String title) {
        return "주세요 title : " + title;
    }

    // http://localhost:8000/post
    // body : title=제목1&content=내용1
    // header : Content-Type : application/x-www-form-urlencoded
    // 멀 줘야 함 - body O
    // request.getParameter() 메서드가 스프링 기본 파싱 전략
    @PostMapping("/post")
    public String test2(String title, String content) {
        return "줄께요 : title : " + title + ", content : " + content;
    }

    // update post set title = ?,content =? where id = ?
    // title, content (primary key : id 같이 보내야한다)
    // 뭘 줘야 수정해준다 - body o
    // API 문서
    @PutMapping("/post/{id}") // where에 들어가는거는 주소에 적어야한다.
    public String post3(String title, String content, @PathVariable int id) { // 내용은 여기
        return "수정해주세요 : title " + title + ", content :" + content + " , id :" + id;
    }

    // http://localhost:8000/post?title=제목1
    // delete from post where title =?

    // http://localhost:8000/post/1
    // delete from post where id =?
    // 구체적으로 삭제해줄 것을 요청 - body x
    @DeleteMapping("/post/{id}")
    public String post4(@PathVariable int id) {
        return "삭제해주세요 id :" + id;
    }

    @DeleteMapping("/post")
    public String post44(String title) {
        return "삭제해주세요 title :" + title;
    }
}
