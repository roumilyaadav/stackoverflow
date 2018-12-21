package com.sof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    //@Autowired
   // private UserDao userDao;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String welcome(Model model) {
      //  userDao.insertUser("SYSUSER", "sysuer15", "abc@com.au", "0893266188");
      //  User userDetails = userDao.findUser("N018003");
        model.addAttribute("user", "Hi Roumil");
        return "welcome";
    }

}