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
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdUser;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;
	
	@Column(name = "Password")
	private String Password;
	/*
	 * @Enumerated(EnumType.STRING) Role role;
	 */

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Column(name = "Phone")
	private int Phone;

	@Column(name = "Email")
	private String email;

	@Column(name = "BirthDate")
	private String BDate;
	
	@Column(name = "Etat")
	private String Etat;
	
	@Column(name = "isActive")
	private Boolean isActive;
	


	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	@Column(name = "Role")
	private Role role;
	

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ForumPost> forumPost;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<ForumPostComment> forumPostComment;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Post> posts;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
	private Set<Reaction> Reactions;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="userdestinataire")
	private Set<Notification> Notifications;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="sender")
	private Set<Invitation> Sender;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="reciver")
	private Set<Invitation> reciver;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user1")
	private Set<Friendship> user1;
	@OneToMany(cascade = CascadeType.ALL, mappedBy="user2")
	private Set<Friendship> user2;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Child> child;
	// -------------------------------------------------------- Getters and Setters --------------------------------------------------

	public String getEtat() {
		return Etat;
	}

	public void setEtat(String etat) {
		Etat = etat;
	}

	public long getIdUser() {
		return IdUser;
	}

	public void setIdUser(long idUser) {
		this.IdUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBDate() {
		return BDate;
	}

	public void setBDate(String bDate) {
		BDate = bDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

// ---------------------------------------------------- ToString ---------------------------------------------------------------

	@Override
	public String toString() {
		return "User [idUser=" + IdUser + ", firstName=" + firstName + ", LastName=" + lastName + ", Phone=" + Phone
				+ ", Mail=" + email + ", BDate=" + BDate + "]";
	}
	
}
