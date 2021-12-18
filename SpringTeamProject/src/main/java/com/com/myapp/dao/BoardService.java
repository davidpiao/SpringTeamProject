package com.com.myapp.dao;

import java.util.List;

import com.com.myapp.bean.BoardVO;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public void deleteBoard(int sid);
	public int updateBoard(BoardVO vo);
	public BoardVO getBoard(int sid);
	public List<BoardVO> getBoardList();
}
