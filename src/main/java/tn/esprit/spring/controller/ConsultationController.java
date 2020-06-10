package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Consultation;
import tn.esprit.spring.entity.Maladie;
import tn.esprit.spring.service.IConsultationService;

@RestController
public class ConsultationController {
	@Autowired
	IConsultationService consultationService;
	
	@GetMapping("/retrieve-all-consultation")
	@ResponseBody
	public List<Consultation> getConsultations() {
		List<Consultation> list = consultationService.GetAllConsultationJPQL();
		return list;

	}
	@GetMapping("/retrieve-stat-consultation")
	@ResponseBody
	public List<Maladie> getstatConsultations() {
		List<Maladie> list = consultationService.getmaladies();
	
		return list;

	}
	@GetMapping("/retrieve-numbers-consultation")
	@ResponseBody
	public List<Long> getnumbersConsultations() {
		List<Long> list = consultationService.getNumbersmaladies();
	
		return list;

	}
	@GetMapping("/retrieve-stats-consultation")
	@ResponseBody
	public List<Consultation> getstatsConsultations() {
		List<Consultation> list = consultationService.GetAllConsultationJPQL();
		return list;

	}

	
	@GetMapping("/rmv-consultation")
	@ResponseBody
	public void rmvConsultation() {
		consultationService.DeleteConsultation((long)2);
	}
	@PostMapping("/add-consultation")
	@ResponseBody
	public void addConsultation(@RequestBody Consultation con) {
		consultationService.AddConsultation(con);
	}
	@GetMapping("/Edit-consultation")
	@ResponseBody
	public void EditConsultation(long id) {
	Consultation	con = consultationService.GetConsultationById(id);
		consultationService.UpdateConsultation(con);
	}

}
