package tn.esprit.spring.service;

import java.util.List;


import tn.esprit.spring.entity.FicheMedical;

public interface IFicheMedicalService {
	public FicheMedical AddFicheMedical(FicheMedical ficheMedical);

	public List<FicheMedical> GetAllFicheMedicalJPQL();

	public FicheMedical GetFicheMedicalById(Long ficheMedicalid);

	public FicheMedical UpdateFicheMedical(FicheMedical ficheMedical);

	public void DeleteFicheMedical(Long ficheMedicalid);

}
