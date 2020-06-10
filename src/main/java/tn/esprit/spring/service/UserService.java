package tn.esprit.spring.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.repository.UserRepository;
@Service
public class UserService implements UserInterface {
	
	
	
	   @Autowired
	    private UserRepository userRepository;

	  



	    @Override
	    public User findUserByEmail(String email) {
	        return userRepository.findByEmail(email);
	    }



	    @Override
	    public void saveUser(User user) {
	        if ((user.getIdUser()) == 0) {
	            user.setPassword(user.getPassword());
	            user.setActive(Boolean.TRUE);
	        }
	        userRepository.save(user);
	    }



	    @Override
	    public List<User> listUsers() {
	        return (List<User>) userRepository.findAll();
	    }



	    


	    @Override
	    public Boolean removeAll() {
	        userRepository.deleteAll();
	        return Boolean.TRUE;
	    }



	    @Override
	    public void removeById(long id) {
	        userRepository.deleteById((long) id);
	    }



	    @Override
	    public User findById(long id) {
	        return userRepository.findById(id).get();
	    }



	    @Override
	    public List<User> searchBy(String keyword, String criteria) {
	        if ("firstName".equals(criteria)) {
	            return userRepository.findByFirstNameIgnoreCaseContaining(keyword);
	        } else if ("lastName".equals(criteria)) {
	            return userRepository.findByLastNameIgnoreCaseContaining(keyword);
	        } else if ("email".equals(criteria)) {
	            return userRepository.findByEmailIgnoreCaseContaining(keyword);
	        }
	        return new ArrayList<>();
	        
	    }



		@Override
		public User login(String email, String password) {
			return userRepository.getEmployeByEmailAndPassword(email, password);
		}
	    
}
