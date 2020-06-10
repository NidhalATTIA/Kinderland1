package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.FicheMedical;
import tn.esprit.spring.repository.FicheMedicalRepository;

@Service
public class FicheMedicalServiceImp implements IFicheMedicalService{
	
	@Autowired
	FicheMedicalRepository ficheMedicalRepository;

	@Override
	public FicheMedical AddFicheMedical(FicheMedical ficheMedical) {
		ficheMedicalRepository.save(ficheMedical);

		return ficheMedical;
	}
	
	@Override
	public List<FicheMedical> GetAllFicheMedicalJPQL() {
		return (List<FicheMedical>) ficheMedicalRepository.findAll();
		 
	}

	@Override
	public FicheMedical GetFicheMedicalById(Long ficheMedicalid) {
		
		return ficheMedicalRepository.findById(ficheMedicalid).orElse(null);
	}

	@Override
	public FicheMedical UpdateFicheMedical(FicheMedical ficheMedical) {
		ficheMedicalRepository.save(ficheMedical);
		return null;
	}

	@Override
	public void DeleteFicheMedical(Long ficheMedicalid) {
		ficheMedicalRepository.deleteById(ficheMedicalid);		
	}


}
