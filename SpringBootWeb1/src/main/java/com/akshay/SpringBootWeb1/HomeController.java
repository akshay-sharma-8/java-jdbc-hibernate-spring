package com.akshay.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called");
		return "index";
	}

    @RequestMapping("add")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {

        int result = num1+num2;

        model.addAttribute("result",result);
        // Model = request-scoped data carrier.
        return "result";
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
