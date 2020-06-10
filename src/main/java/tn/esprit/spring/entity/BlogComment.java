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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class BlogComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdBlogComment;
	
	@Column(name = "TextComment")
	private String TextComment;
	
	@Column(name = "ImageComment")
	private String ImageComment;
	
	@Column(name = "DateComment")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date DatePost;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<Blog> blog;
	
	// -------------------------------------------------------- Getters and Setters ------------------------------------------------	


	public long getIdBlogComment() {
		return IdBlogComment;
	}

	public void setIdBlogComment(long idBlogComment) {
		IdBlogComment = idBlogComment;
	}

	public String getTextComment() {
		return TextComment;
	}

	public void setTextComment(String textComment) {
		TextComment = textComment;
	}

	public String getImageComment() {
		return ImageComment;
	}

	public void setImageComment(String imageComment) {
		ImageComment = imageComment;
	}

	public Date getDatePost() {
		return DatePost;
	}

	public void setDatePost(Date datePost) {
		DatePost = datePost;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Set<Blog> getBlog() {
		return blog;
	}

	public void setBlog(Set<Blog> blog) {
		this.blog = blog;
	}
	
	
	// ---------------------------------------------------- ToString ---------------------------------------------------------------

	

	@Override
	public String toString() {
		return "BlogComment [IdBlogComment=" + IdBlogComment + ", TextComment=" + TextComment + ", ImageComment="
				+ ImageComment + ", DatePost=" + DatePost + "]";
	}
	

	
	
	
	

}
