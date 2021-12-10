package com.com.myapp.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;
   
   public UserVO getUser(UserVO vo) {
      String sql = "select * from BOARD where seq=" + seq;
      return sqlse.queryForObject(sql, new BoardRowMapper());
   }

}