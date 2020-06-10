package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.RDVMedical;

public interface RDVMedicalRepository extends CrudRepository<RDVMedical, Long>{

}
