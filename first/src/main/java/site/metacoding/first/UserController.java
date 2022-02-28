package site.metacoding.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

// Data를 리턴하는 컨트롤러 , 버퍼를 리턴
@RestController
public class UserController {

    Dog d;

    // DI라고함. IoC 컨테이너에 있으니까 주입해 줄 수 있음
    // Dependency Injection 의존성 주입
    public UserController(Dog d, HttpServerErrorException request) {
        System.out.println("생성자 실행됨");
        this.d = d;
    }

    @GetMapping("/home")
    public void home() {
        System.out.println("home~~~~~~~~~~");
    }

    @GetMapping("/bye")
    public void bye() {
        System.out.println("bye~~~~");
    }

    @GetMapping("/data")
    public String data() {
        return "<h1>data</h1>"; // PrintWriter -> write -> flush
    }
}