package tn.esprit.spring.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.jpa.repository.Temporal;

@Entity 
public class Reclamation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdReclamation;

	@Column(name = "IdUser")
	private int IdUser;

	@Column(name = "TitleReclamation")
	private String TitleReclamation;

	@CreationTimestamp
	@Column(name = "DateReclamation")
	private Date DateReclamation;


	@Column(name = "TextReclamation")
	private String TextReclamation;

	@Column(name = "ImageReclamation")
	private String ImageReclamation;
	
	@Column(name = "Treated")
	private Boolean Treated;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	User user;

	public long getIdReclamation() {
		return IdReclamation;
	}

	public void setIdReclamation(long idReclamation) {
		IdReclamation = idReclamation;
	}

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getTitleReclamation() {
		return TitleReclamation;
	}

	public void setTitleReclamation(String titleReclamation) {
		TitleReclamation = titleReclamation;
	}

	public Date getDateReclamation() {
		return DateReclamation;
	}

	public void setDateReclamation(Date dateReclamation) {
		DateReclamation = dateReclamation;
	}

	public String getTextReclamation() {
		return TextReclamation;
	}

	public void setTextReclamation(String textReclamation) {
		TextReclamation = textReclamation;
	}

	public String getImageReclamation() {
		return ImageReclamation;
	}

	public void setImageReclamation(String imageReclamation) {
		ImageReclamation = imageReclamation;
	}

	public Boolean getTreated() {
		return Treated;
	}

	public void setTreated(Boolean treated) {
		Treated = treated;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Reclamation [IdReclamation=" + IdReclamation + ", IdUser=" + IdUser + ", TitleReclamation="
				+ TitleReclamation + ", DateReclamation=" + DateReclamation + ", TextReclamation=" + TextReclamation
				+ ", ImageReclamation=" + ImageReclamation + ", Treated=" + Treated + ", user=" + user + "]";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
