package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Admin;

public interface IAdminService {

	public Admin AddAdmin(Admin admin);

	public List<Admin> GetAllAdminJPQL();

	public Admin GetAdminById(Long adminId);

	public Admin UpdateAdmin(Admin admin);

	public void DeleteAdmin(Long adminId);
}
