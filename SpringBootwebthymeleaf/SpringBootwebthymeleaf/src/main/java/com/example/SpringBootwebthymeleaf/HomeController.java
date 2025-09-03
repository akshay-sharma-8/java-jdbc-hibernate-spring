package com.example.SpringBootwebthymeleaf;



import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {

        int result = num1+num2;

//        model.addAttribute("result",result);
        // Model = request-scoped data carrier.

        mv.addObject("result",result);
        mv.setViewName("result");
        return mv;
    }



//    @RequestMapping("addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("alien",alien);
//        mv.setViewName("result");
//        return mv;
//    }


//    @RequestMapping("addAlien")
//    public String addAlien(@ModelAttribute("alien1") Alien alien){
//        return "result";
//    }

//    @ModelAttribute if we want different name of object we can use it


    @RequestMapping("addAlien")
    public String addAlien(Alien alien){
        return "result";
    }



    @ModelAttribute("course")
    public String addcourse(){
        return "java";
    }


}


//
//
//User (Browser)
//         |
//         v
//DispatcherServlet (Front Controller)
//         |
//         v
//Controller (HomeController.add)
//   - takes input (num1, num2)
//   - calls business logic
//   - puts result in Model
//         |
//         v
//Model (carries data)
//   - result = 30
//        |
//        v
//View (result.jsp)
//   - shows "Result is: 30"
//        |
//        v
//Response back to user
