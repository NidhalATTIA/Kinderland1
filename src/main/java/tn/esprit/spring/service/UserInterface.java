package tn.esprit.spring.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import tn.esprit.spring.entity.User;

public interface UserInterface {
	 User findUserByEmail(String email);

	    void saveUser(User user);

	    Boolean removeAll();

	    void removeById(long id);

	    User findById(long id);

	    User login( String email , String password );
	    List<User> listUsers();

	    List<User> searchBy(String keyword, String criteria);
	    
}
