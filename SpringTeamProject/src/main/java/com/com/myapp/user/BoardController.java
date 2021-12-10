package com.com.myapp.user;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mycom.myapp.board.BoardDAO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BoardController {
	@Autowired
	BoardDAO boardDAO;
	@Autowired
	BoardService boardService;
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "list";
	}
	
	@RequestMapping(value = "/board/list", method = RequestMethod.GET)
	public String boardlist(Model model) {
		model.addAttribute("list", boardDAO.getBoardList());
		return "list";
	}
	
	@RequestMapping(value = "/board/add", method = RequestMethod.GET)
	public String addPost() {
		return "addpostform";
	}
	
	@RequestMapping(value = "/board/addok", method = RequestMethod.POST)
	public String addPostOK(BoardVO vo) {
		int i = boardDAO.insertBoard(vo);
		if(i==0) System.out.println("데이터 추가 실패!");
		else System.out.println("데이터 추가 성공!");
		return "redirect:list";
	}
	
	@RequestMapping(value = "/board/editform/{id}", method = RequestMethod.GET)
	public String editPost(@PathVariable("id") int id, Model model) {
		BoardVO boardVO = boardDAO.getBoard(id);
		model.addAttribute("boardVO", boardVO);
		return "editform";
	}
	
	@RequestMapping(value="/board//deleteok/{id}", method = RequestMethod.GET)
	public String deletePost(@PathVariable("id")int id) {
		int i = boardService.deleteBoard(id);
		if(i==0) System.out.println("데이터 삭제 실패!");
		else System.out.println("데이터 삭제 성공!");
		return "redirect:../list";
	}
	
	@RequestMapping(value="/board//editok", method = RequestMethod.POST)
	public String editPostOK(BoardVO vo) {
		int i = boardService.updateBoard(vo);
		if(i==0) System.out.println("데이터 수정 실패!");
		else System.out.println("데이터 수정 성공!");
		return "redirect:list";
	}
}
