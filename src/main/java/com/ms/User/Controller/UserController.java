package com.ms.User.Controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ms.User.Service.UserService;
import com.ms.domain.User;

@Controller
public class UserController {
	
	@Resource(name="userServiceImp")
	private UserService userService;
	
	@RequestMapping("/login")
	public ModelAndView login(User user){
		System.out.println("hi");
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		User loginUser = userService.loginUser(user);
		if(loginUser!=null){
			System.out.println(loginUser);
			modelAndView.setViewName("mainTemp");
		}else{
			System.out.println(loginUser);
			modelAndView.setViewName("login");
			modelAndView.addObject("user",user );
			modelAndView.addObject("msg", "用户名或密码错误");
		}
		return modelAndView;
	}
	
	@RequestMapping("/deleteUser")
	public ModelAndView deleteUser(){
		return null;
	}
	
	@RequestMapping("/getUser")
	public ModelAndView getUser(){
		userService.getUser(new User());
		return null;
	}
	@RequestMapping("/upDataUser")
	public ModelAndView register(){
		return null;
	}
}
