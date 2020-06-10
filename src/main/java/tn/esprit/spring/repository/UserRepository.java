package tn.esprit.spring.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByEmail(String Mail);

    List<User> findByFirstNameIgnoreCaseContaining(String FirstName);

    List<User> findByLastNameIgnoreCaseContaining(String LastName);

    List<User> findByEmailIgnoreCaseContaining(String Mail);

    @Query("SELECT t FROM User t WHERE " +
            "LOWER(t.lastName) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
            "LOWER(t.firstName) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
    Page<User> searchByTerm(@Param("searchTerm") String searchTerm, Pageable pageable);
    
    @Query("SELECT e FROM User e WHERE e.email=:email and e.Password=:password")

    public User getEmployeByEmailAndPassword(@Param("email")String login,@Param("password")String password);
}
