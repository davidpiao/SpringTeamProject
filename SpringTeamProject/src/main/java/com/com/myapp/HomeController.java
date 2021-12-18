package com.com.myapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.com.myapp.user.UserServiceImpl;
import com.com.myapp.user.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	UserServiceImpl service;

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/loginOk", method = RequestMethod.POST)
	public String loginCheck(HttpSession session, UserVO vo) {
		String returnURL = "";
		if (session.getAttribute("login") != null) {
			session.removeAttribute("login");
		}
		UserVO loginvo = service.getUser(vo);
		if (loginvo != null) { // 로그인 성공
			System.out.println("로그인 성공!");
			session.setAttribute("login", loginvo);
			returnURL = "redirect:/posts";
		} else { // 로그인 실패
			System.out.println("로그인 실패!");
			returnURL = "redirect:/";
		}
		return returnURL;
	}

	// 로그아웃 하는 부분
	@RequestMapping(value = "/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	//회원가입
	@RequestMapping(value = "/register")
	public String register() {
		return "register";
	}
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String registerUser(UserVO vo) {
		UserVO loginvo = service.getSid(vo);
		int i = 0;
		if (loginvo == null) { // 회원가입 성공 
			i = service.insertUser(vo);
		} 
		else if(i == 0){ // 회원가입 실패
			System.out.println("회원가입 실패!");
		}
		else {
			System.out.println("회원가입 성공!");
			return "redirect:/";
		}
		return "redirect:/";
	}
}

