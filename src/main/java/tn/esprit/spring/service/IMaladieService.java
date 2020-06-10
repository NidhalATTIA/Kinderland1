package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Maladie;

public interface IMaladieService {
	public Maladie AddMaladie(Maladie maladie);

	public List<Maladie> GetAllMaladieJPQL();

	public Maladie GetMaladieById(Long maladieId);

	public Maladie UpdateMaladie(Maladie maladie);

	public void DeleteMaladie(Long maladieId);

}
