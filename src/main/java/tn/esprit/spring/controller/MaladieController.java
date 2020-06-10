package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.FicheMedical;
import tn.esprit.spring.entity.Maladie;
import tn.esprit.spring.service.IFicheMedicalService;
import tn.esprit.spring.service.IMaladieService;

@RestController
public class MaladieController {
	@Autowired
	IMaladieService MaladieService;
	
	@GetMapping("/retrieve-all-maladies")
	@ResponseBody
	public List<Maladie> getFicheMedicals() {
		List<Maladie> list = MaladieService.GetAllMaladieJPQL();
		return list;

	}

	
	@GetMapping("/rmv-maladie")
	@ResponseBody
	public void rmvFicheMedical() {
		MaladieService.DeleteMaladie((long)2);
	}
	
	@GetMapping("/find-maladie")
	@ResponseBody
	public Maladie findFicheMedical() {
		return  MaladieService.GetMaladieById((long) 1);
	}
	
	@PostMapping("/add-maladie")
	@ResponseBody
	public void addConsultation(@RequestBody Maladie con) {
		MaladieService.AddMaladie(con);
	}
	
	@GetMapping("/Edit-maladie")
	@ResponseBody
	public void EditConsultation(long id) {
	Maladie fiche = MaladieService.GetMaladieById(id);
	MaladieService.UpdateMaladie(fiche);
	}
}
