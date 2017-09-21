package cloud.dao;

import java.util.List;

import cloud.model.User;


public interface UserMapper {

	List<User> findAll();
}
