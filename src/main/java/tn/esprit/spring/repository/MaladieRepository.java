package tn.esprit.spring.repository;


import org.springframework.data.repository.CrudRepository;


import tn.esprit.spring.entity.Maladie;


public interface MaladieRepository extends CrudRepository<Maladie, Long>{
	
}
