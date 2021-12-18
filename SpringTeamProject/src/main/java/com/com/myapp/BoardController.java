package com.com.myapp;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.com.myapp.bean.BoardVO;
import com.com.myapp.dao.BoardService;
import com.com.myapp.user.UserServiceImpl;
import com.com.myapp.user.UserVO;



@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	BoardService boardService;
	@Autowired
	UserServiceImpl service;
	
	@RequestMapping(value = "/posts", method = RequestMethod.GET)
	public String boardList(Model model) {
		model.addAttribute("list",boardService.getBoardList());
		return "list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addPost(Model model,HttpSession session) {
		UserVO userVO = (UserVO)session.getAttribute("login");
		model.addAttribute("us",userVO);
		Object obj = session.getAttribute("login");
		if (obj != null) {
			System.out.println(userVO.getUserid());
		}
		return "addpostform";
	}
	
	@RequestMapping(value = "/addok", method = RequestMethod.POST)
	public String addPostOk(BoardVO vo) {
		int i=boardService.insertBoard(vo);
		if(i==0) {
			System.out.println("������ �߰� ����");
		}
		else
			System.out.println("������ �߰� ����");
		
		return "redirect:posts";
	}
	
	@RequestMapping(value = "/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id")int id, Model model,Model model2,HttpSession session) {
		BoardVO boardVO = boardService.getBoard(id);
		model.addAttribute("u",boardVO);
		UserVO userVO = (UserVO)session.getAttribute("login");
		model2.addAttribute("us",userVO);
		return "editform";
	}
	
	@RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
	public String detailPost(@PathVariable("id")int id, Model model) {
		BoardVO boardVO = boardService.getBoard(id);
		model.addAttribute("u",boardVO);
		return "detail";
	}
	
	@RequestMapping(value = "/editok", method = RequestMethod.POST)
	public String editPostOk(BoardVO vo) {
		String result = "alert2";
		int current = Integer.parseInt(vo.getCurrent());
		int previous = Integer.parseInt(vo.getPrevious());
		int max = Integer.parseInt(vo.getMax());
		if(current>previous&&current<=max&&!vo.getSeller().equals(vo.getBuyer())) {
			result = "redirect:posts";
			boardService.updateBoard(vo);
		}
		
		return result;
	}
	
	@RequestMapping(value = "/deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id")int id,HttpSession session) {
		String result = "alert";
		UserVO userVO = (UserVO) session.getAttribute("login");
		if(userVO.getUsername().equals(boardService.getBoard(id).getSeller())) {
			boardService.deleteBoard(id);
			result = "redirect:../posts";
		}
		
		return result;
	}
	
	
}
