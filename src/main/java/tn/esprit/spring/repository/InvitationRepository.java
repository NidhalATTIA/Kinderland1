package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.Invitation;
import tn.esprit.spring.entity.User;

public interface InvitationRepository extends CrudRepository<Invitation, Long>{


	@Query("SELECT e.parent FROM Child e where e.kindergarten.IdKindergarden =:id")
	public List <User> getsuggestions(@Param("id")long id);
	
}
