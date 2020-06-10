package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Reclamation;
import tn.esprit.spring.service.ReclamationService;

@RestController
public class RestControllerReclamation {
 
	@Autowired 
	ReclamationService ireclamationservice ;
	// http://localhost:8081/SpringMVC/servlet/ajouterEmployer
	//{"id":1,"nom":"kallel", "prenom":"khaled", "email":"Khaled.kallel@ssiiconsulting.tn", "isActif":true, "role":"INGENIEUR "}
	
	@PostMapping("/AddReclamation")
	@ResponseBody
	public Reclamation AddReclamation(@RequestBody Reclamation reclamation)
	{
		ireclamationservice.AddReclamation(reclamation);
		return reclamation;
	}
	@PutMapping(value = "/updateReclamation/{ReclamationId}/{TextReclamation1}") 
	@ResponseBody
	public void UpdateReclamation(@PathVariable("TextReclamation1")String textReclamation, @PathVariable("ReclamationId")Long ReclamationId){
		ireclamationservice.UpdateReclamation(textReclamation, ReclamationId);
		
	}
	  @DeleteMapping("/deleteReclamationbyid/{idReclamation}") 
		@ResponseBody 
		public void deleteReclamationById(@PathVariable("idReclamation")Long ReclamationId) {
		  ireclamationservice.DeleteReclamation(ReclamationId);
			
		}
	  @PutMapping(value = "/TreatReclamation/{ReclamationId}") 
		@ResponseBody
		public void TreatReclamation(@PathVariable("ReclamationId")Long ReclamationId){
			ireclamationservice.TreatReclamation( ReclamationId);
			
		}
	   @GetMapping(value = "getAllReclamationJPQL")
	    @ResponseBody
		public List<Reclamation> getAllReclamationJPQL() {
			
			return ireclamationservice.GetAllReclamationJPQL();
		}
	   
	   @GetMapping(value = "GetReclamationbyId/{ReclamationId}")
	    @ResponseBody
		public Reclamation GetReclamationById(@PathVariable("ReclamationId")Long ReclamationId) {
			
			return ireclamationservice.GetReclamationById(ReclamationId);
		}
	   
	   @GetMapping(value = "getAllReclamationByIdUser/{IdUser}")
	    @ResponseBody
		public List<Reclamation> getAllReclamationByIdUser(@PathVariable("IdUser")Long IdUser) {
			
			return ireclamationservice.getReclamationbyidUser(IdUser);
		}
	   
	   @GetMapping(value = "GetTreatedReclamation")
	    @ResponseBody
		public List<Reclamation> TreatedReclamation() {
			
			return ireclamationservice.TreatedReclamation();
		}
	   
	   @GetMapping(value = "GetNoTreatedReclamation")
	    @ResponseBody
		public List<Reclamation> NoTreatedReclamation() {
			
			return ireclamationservice.NoTreatedReclamation();
		}
}
