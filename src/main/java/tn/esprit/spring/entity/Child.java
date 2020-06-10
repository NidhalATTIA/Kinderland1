package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Child implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idChild;

	@Column(name = "Firstname")
	private String firstname;

	@Column(name = "Lastname")
	private String lastname;

	@Column(name = "DateBirth")
	private Date dateBirth;

	@Column(name = "Niveau")
	private String niveau;
	
	@ManyToOne
	User parent;
	
	@ManyToOne
	Kindergarden kindergarten;


	public FicheMedical getFicheMedical() {
		return ficheMedical;
	}

	public void setFicheMedical(FicheMedical ficheMedical) {
		this.ficheMedical = ficheMedical;
	}

	@OneToOne
	private FicheMedical ficheMedical;
	
	public int getIdChild() {
		return idChild;
	}

	public void setIdChild(int idChild) {
		this.idChild = idChild;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(Date dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

}