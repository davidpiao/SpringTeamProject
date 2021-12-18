package com.com.myapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.com.myapp.bean.BoardVO;

@Repository
public class BoardDAO {
	
	@Autowired
	   	   SqlSession sqlSession;
	   
	   public int insertBoard(BoardVO vo) {
		   System.out.println("insert board");
		   int result = sqlSession.update("BoardDAO.insertBoard", vo);
		   return result;
	   }
	   
	   public void deleteBoard(int sid) {
		   System.out.println("delete board");
		   sqlSession.delete("BoardDAO.deleteBoard",sid);
		}
	   
	   public int updateBoard(BoardVO vo) {
		   System.out.println("update board");
		   int result = sqlSession.update("BoardDAO.updateBoard",vo);
		   return result;
		}	
	   
	   public BoardVO getBoard(int sid) {
		   System.out.println("get board");
	      BoardVO one = sqlSession.selectOne("BoardDAO.getBoard", sid);
	      return one;
	   }
	   
	   public List<BoardVO> getBoardList() {
		   List<BoardVO> list = sqlSession.selectList("BoardDAO.getBoardList");
	      return list;
	   }
}
