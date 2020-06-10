package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Maladie;
import tn.esprit.spring.repository.MaladieRepository;

@Service
public class MaladieServiceImp implements IMaladieService {
	@Autowired
	MaladieRepository maladieRepository;
	
	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);
	
	@Override
	public Maladie AddMaladie(Maladie notification) {
		return maladieRepository.save(notification);
		
	}

	@Override
	public List<Maladie> GetAllMaladieJPQL() {
		return (List<Maladie>) maladieRepository.findAll();
		
	}

	@Override
	public Maladie GetMaladieById(Long notificationId) {
		Maladie Invitation = maladieRepository.findById(notificationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	@Override
	public Maladie UpdateMaladie(Maladie notification) {
		return maladieRepository.save(notification);
	}

	@Override
	public void DeleteMaladie(Long notificationId) {
	
		maladieRepository.deleteById(notificationId);
	}

}
