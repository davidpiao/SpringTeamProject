package com.com.myapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	LoginDAO LoginDAO;

	@Override
	public int insertUser(UserVO vo) {
	      return LoginDAO.insertUser(vo);
	   }
	public UserVO getUser(UserVO vo) {
	      return LoginDAO.getUser(vo);
	   }
	public UserVO getSid(UserVO vo) {
	      return LoginDAO.getSid(vo);
	   }
}
