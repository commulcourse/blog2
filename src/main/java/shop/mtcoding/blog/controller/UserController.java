package shop.mtcoding.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String login() {
        return "user/loginForm";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "user/joinForm";
    }

    @GetMapping("/updateForm")
    public String updateForm() {
        return "user/updateForm";
    }

}
