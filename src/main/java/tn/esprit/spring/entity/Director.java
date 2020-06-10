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
public class Director  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDirector;
	
	@Column(name = "KinderGarden")
	private int IdKinderGarden;
	public Director() {
		super();
	}
	
	// -------------------------------------------------------- Getters and Setters --------------------------------------------------

	public Director(int id) {
		
		this.idDirector = id;
	}

	public int getId() {
		return idDirector;
	}

	public void setId(int id) {
		this.idDirector = id;
	}
	


	public int getIdDirector() {
		return idDirector;
	}

	public void setIdDirector(int idDirector) {
		this.idDirector = idDirector;
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
