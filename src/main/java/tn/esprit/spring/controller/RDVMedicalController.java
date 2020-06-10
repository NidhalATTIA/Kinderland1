package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.RDVMedical;
import tn.esprit.spring.service.IRDVMedicalService;

@RestController
public class RDVMedicalController {

	@Autowired
	IRDVMedicalService RDVMedical;
	
	@GetMapping("/retrieve-all-rdvs")
	@ResponseBody
	public List<RDVMedical> getFicheMedicals() {
		List<RDVMedical> list = RDVMedical.GetAllRDVMedicalJPQL();
		return list;

	}
	
	@DeleteMapping("/rmv-rdv")
	@ResponseBody
	public void rmvRDVMedical() {
		RDVMedical.DeleteRDVMedical((long)2);
	}
	
	@GetMapping("/find-rdv")
	@ResponseBody
	public RDVMedical findRDVMedical() {
		return  RDVMedical.GetRDVMedicalById((long) 1);
	}
	@PostMapping("/add-rdv")
	@ResponseBody
	public void addRDVMedical(@RequestBody RDVMedical con) {
		RDVMedical.AddRDVMedical(con);
	}
	@PutMapping("/Edit-rdv")
	@ResponseBody
	public void EditRDVMedical(@RequestBody RDVMedical con,long id) {
	RDVMedical fiche = RDVMedical.GetRDVMedicalById(id);
	fiche.setDate(con.getDate());
	RDVMedical.UpdateRDVMedical(fiche);
	}
}
