package site.metacoding.first;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//파일을 리턴함 
// (RequestDispatcher dis = request.getRequestDispatcher("파일명"));
// dis.forward(request,response);
@Controller
public class PostController {

    @GetMapping("/imgTest")
    public String imgTest() {
        return "imgTest";
    }

    @GetMapping("/writeForm")
    public String writeForm() {
        return "writeForm"; // 파일의 위치는 무조건 templates가 들고있다. 확장자는 자동으로 jsp
    }

    @GetMapping("/updateForm")
    public String updateForm() {
        return "updateForm";
    }

}
