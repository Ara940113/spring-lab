package site.metacoding.first;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component // 특별한 목적없이 IoC에 등록하고 싶을 때
public class Dog {
    private String name = "푸들";

    public Dog(HttpServletRequest request) {
        System.out.println("강아지가 IoC 컨테이너에 등록되었어요");
    }

}
