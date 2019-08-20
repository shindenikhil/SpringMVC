package com.netcracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("display.jsp");
        modelAndView.addObject("name",name);
        modelAndView.addObject("password",password);

        return modelAndView;
    }
}
