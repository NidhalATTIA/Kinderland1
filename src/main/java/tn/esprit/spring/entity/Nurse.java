package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Nurse  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNurse;

	

	public int getIdNurse() {
		return idNurse;
	}


	public void setIdNurse(int idNurse) {
		this.idNurse = idNurse;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
	
}
