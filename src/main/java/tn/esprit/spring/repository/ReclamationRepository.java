package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entity.Reclamation;

public interface ReclamationRepository extends CrudRepository<Reclamation, Long>{

	  @Modifying
	    @Transactional
	    @Query("UPDATE Reclamation e SET e.TextReclamation=:TextReclamation1 where e.IdReclamation=:ReclamationId")
	    public void UpdateReclamation(@Param("TextReclamation1")String textReclamation, @Param("ReclamationId")Long ReclamationId);
	  
	  @Modifying
	    @Transactional
	    @Query("UPDATE Reclamation e SET e.Treated=1 where e.IdReclamation=:ReclamationId")
	    public void TreatReclamation(@Param("ReclamationId")Long ReclamationId);
	  
	  @Query("SELECT r FROM Reclamation r join User u on r.user=u.IdUser WHERE u.IdUser=:user")
	    public  List<Reclamation>  getReclamationbyidUser(@Param("user")Long iduser);
	  
	  @Query("SELECT r FROM Reclamation r WHERE r.Treated=1")
	    public  List<Reclamation>  TreatedReclamation();
	  
	  @Query("SELECT r FROM Reclamation r WHERE r.Treated=NULL")
	    public  List<Reclamation>  NoTreatedReclamation();
}
