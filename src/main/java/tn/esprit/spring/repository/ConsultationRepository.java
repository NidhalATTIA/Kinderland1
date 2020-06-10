package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.entity.Maladie;


public interface ConsultationRepository extends CrudRepository<Consultation, Long>{

	@Query(" SELECT m.Maladie From Consultation m  GROUP BY m.Maladie.Id order by count(m.Maladie.nom) desc")
	 List<Maladie>getmaladies();
	@Query(" SELECT count(*) From Consultation m  GROUP BY m.Maladie.Id order by count(m.Maladie.nom) desc")
	List<Long> getnbmaladies();
}


