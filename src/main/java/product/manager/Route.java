package product.manager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Route {
    
    public void getTry() {
        try {System.out.print("");} catch(Exception e) {};
    }
    
    @RequestMapping("/user")
    public String getUser(){
        return "userHome";
    }
    
    @RequestMapping("/admin")
    public String getAdmin(){
        return "adminHome";
    }
//    @RequestMapping("/")
//    public String getIndex(){
//        return "index";
//    }
}
