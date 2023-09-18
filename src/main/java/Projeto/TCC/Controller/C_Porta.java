package Projeto.TCC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class C_Porta {

    @GetMapping("/")
    public String getLogin(){
        return "Login/login";
    }

    @GetMapping("/index")
    public String getIndex(){
        return "Index/index";
    }


}
