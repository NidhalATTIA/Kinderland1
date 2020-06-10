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
public class Parent  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idParent;
	
	@Column(name = "KinderGarden")
	private int IdKinderGarden;
	
	// -------------------------------------------------------- Getters and Setters --------------------------------------------------


	public Parent(int id) {
		
		this.idParent = id;
	}

	public int getId() {
		return idParent;
	}

	public void setId(int id) {
		this.idParent = id;
	}
	
	
	public int getIdParent() {
		return idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	public int getIdKinderGarden() {
		return IdKinderGarden;
	}

	public void setIdKinderGarden(int idKinderGarden) {
		IdKinderGarden = idKinderGarden;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	
	
}
