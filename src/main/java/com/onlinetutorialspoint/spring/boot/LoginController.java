package com.onlinetutorialspoint.spring.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinetutorialspoint.bean.LoginBean;

@Controller
public class LoginController {
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String init(Model model) {
		model.addAttribute("msg", "Please Enter Your Login Details");
		return "login.jsp";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(Model model, @ModelAttribute("loginBean") LoginBean loginBean) {
		if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {
			if (loginBean.getUserName().equals("suddin") && loginBean.getPassword().equals("suddin@12")) {
				model.addAttribute("msg", loginBean.getUserName());
				return "success.jsp";
			} else {
				model.addAttribute("error", "Invalid Details");
				return "login.jsp";
			}
		} else {
			model.addAttribute("error", "Please enter Details");
			return "login.jsp";
		}
	}
}
