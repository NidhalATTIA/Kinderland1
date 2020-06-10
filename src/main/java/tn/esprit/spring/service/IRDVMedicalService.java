package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.RDVMedical;

public interface IRDVMedicalService {
	public RDVMedical AddRDVMedical(RDVMedical RDVMedical);

	public List<RDVMedical> GetAllRDVMedicalJPQL();

	public RDVMedical GetRDVMedicalById(Long RDVMedicalId);

	public RDVMedical UpdateRDVMedical(RDVMedical RDVMedical);

	public void DeleteRDVMedical(Long RDVMedicalId);
}
