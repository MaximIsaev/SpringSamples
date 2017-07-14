package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Maxim on 14.07.2017.
 */

@Controller
public class HelloWorldSecurity {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView helloSecurity(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        return modelAndView;
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public ModelAndView helloAdmin(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return modelAndView;
    }
}
