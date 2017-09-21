package cloud.domain;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloud.dao.UserMapper;
import cloud.model.User;



@Service
@Transactional
public class UserService {

	
	@Autowired
	private UserMapper userMapper;
	
	public List<User> searchAll(){
		List<User> list = userMapper.findAll();
		return list;
	}
}
