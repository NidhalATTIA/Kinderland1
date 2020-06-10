package tn.esprit.spring.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name = "label")
	private String content;
	
	@Column(name = "urlpic")
	private String pictureUrl;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Reaction> reaction;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Reaction> getReaction() {
		return reaction;
	}

	public void setReaction(Set<Reaction> reaction) {
		this.reaction = reaction;
	}

	
}
