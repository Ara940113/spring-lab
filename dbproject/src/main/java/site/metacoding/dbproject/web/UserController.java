package site.metacoding.dbproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UserController {

    // 회원가입 페이지 (정적) -로그인 x
    @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

    // 회원 가입 - 로그인 x
    @PostMapping("/join")
    public String join() {
        return "redirect:/user/loginForm"; // 로그인페이지로 이동해주는 컨트롤러 메서드를 재활용
    }

    // 로그인 페이지 (정적) -로그인x
    @GetMapping("/loginForm")
    public String loginForm() {
        return "user/loginForm";
    }

    // SELECT * FROM user WHERE username=? And password=?
    // 원래 select는 무조건 get요청
    // 근데 로그인만 예외 (post)
    // 이유 : 주소에 패스워드를 남길 수 없으니까! (보안을 위해서)
    // 로그인 - 로그인 x
    @PostMapping("/login")
    public String login() {
        return "메인페이지를 돌려주면 됨"; // PostController 만들고 수정하자
    }

    // 유저 상세 페이지 (동적) - 동적페이지는 값마다 다르기 때문에 디비연동이 필요
    // 로그인 - 로그인 o
    @GetMapping("/user/{id}}")
    public String detail(@PathVariable Integer id) {
        return "user/detail";
    }

    // 유저 수정 페이지 (동적) - 동적페이지는 값마다 다르기 때문에 디비연동이 필요
    // 로그인 - 로그인 o
    @GetMapping("/user/{id}/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }

    // 유저수정 - 로그인 o
    @PutMapping("/user/{id}")
    public String update(@PathVariable Integer id) {
        return "redirect:/user/" + id;
    }

    // 로그아웃 - 로그인 o
    @GetMapping("/logout")
    public String logout() {
        return "메인페이지를 돌려주면 됨"; // PostController 만들고 수정하자
    }

}
