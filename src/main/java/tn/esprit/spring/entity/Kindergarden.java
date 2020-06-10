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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kindergarden implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdKindergarden;

	private String Title;

	private String Adress;

	private String Tel;

	private Date CreationDate;
	
	private String worktime;
	
	private Integer NumberEmployee;

	private String Logo;
	@Column(name = "cost")
	private float Cost;

	
	@OneToOne
	private Director director;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Child> child;
	/*
	@OneToMany(cascade = CascadeType.ALL, mappedBy="kindergardens")
	private Set<Teacher> Teachers;
	*/
	public Long getIdKindergarden() {
		return IdKindergarden;
	}

	public void setIdKindergarden(Long idKindergarden) {
		IdKindergarden = idKindergarden;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public Date getCreationDate() {
		return CreationDate;
	}

	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}

	public Integer getNumberEmployee() {
		return NumberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		NumberEmployee = numberEmployee;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}

	public float getCost() {
		return Cost;
	}

	public void setCost(float cost) {
		Cost = cost;
	}

	@Override
	public String toString() {
		return "Kindergarden [IdKindergarden=" + IdKindergarden + ", Title=" + Title + ", Adress=" + Adress + ", Tel="
				+ Tel + ", CreationDate=" + CreationDate + ", NumberEmployee=" + NumberEmployee + ", Logo=" + Logo
				+ ", Cost=" + Cost + "]";
	}

}
