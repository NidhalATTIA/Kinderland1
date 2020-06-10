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
public class Teacher  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTeacher;
	
	@Column(name = "KinderGarden")
	private int IdKinderGarden;
	
	// -------------------------------------------------------- Getters and Setters --------------------------------------------------


	public Teacher(int id) {
		
		this.idTeacher = id;
	}

	public int getId() {
		return idTeacher;
	}

	public void setId(int id) {
		this.idTeacher = id;
	}
	


	public int getIdTeacher() {
		return idTeacher;
	}

	public void setIdTeacher(int idTeacher) {
		this.idTeacher = idTeacher;
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
