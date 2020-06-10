package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Consultation implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Date")
	private String date;

	@ManyToOne
    @JoinColumn(name = "idfiche", referencedColumnName = "idfiche", insertable= false,updatable= false)
	private FicheMedical Fiche;
	@ManyToOne
    @JoinColumn(name = "idmaladie", referencedColumnName = "Id", insertable= false,updatable= false)
	private Maladie Maladie;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public FicheMedical getFiche() {
		return Fiche;
	}
	public void setFiche(FicheMedical fiche) {
		Fiche = fiche;
	}
	
	public Maladie getMaladie() {
		return Maladie;
	}
	public void setMaladie(Maladie maladie) {
		Maladie = maladie;
	}


}
