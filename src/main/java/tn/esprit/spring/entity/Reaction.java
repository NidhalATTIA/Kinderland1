package tn.esprit.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reaction implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "ReactType")
	private ReactType reacttype;
	
	@ManyToOne
	Post post;
	
	@ManyToOne
	User user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ReactType getReacttype() {
		return reacttype;
	}

	public void setReacttype(ReactType reacttype) {
		this.reacttype = reacttype;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
