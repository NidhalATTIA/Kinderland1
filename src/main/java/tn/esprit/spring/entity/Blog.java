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
public class Blog implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdBlog;

	@Column(name = "IdUser")
	private int IdUser;

	@Column(name = "TitleBlog")
	private String TitleBlog;

	@Column(name = "DateBlog")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date DateBlog;

	@Column(name = "TextBlog")
	private String TextBlog;

	@Column(name = "ImageBlog")
	private String ImageBlog;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Admin admin;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private Set<BlogComment> blogComment;
	
	// -------------------------------------------------------- Getters and Setters ------------------------------------------------	

	public long getIdBlog() {
		return IdBlog;
	}

	public void setIdBlog(long idBlog) {
		IdBlog = idBlog;
	}

	public int getIdUser() {
		return IdUser;
	}

	public void setIdUser(int idUser) {
		IdUser = idUser;
	}

	public String getTitleBlog() {
		return TitleBlog;
	}

	public void setTitleBlog(String titleBlog) {
		TitleBlog = titleBlog;
	}

	public Date getDateBlog() {
		return DateBlog;
	}

	public void setDateBlog(Date dateBlog) {
		DateBlog = dateBlog;
	}

	public String getTextBlog() {
		return TextBlog;
	}

	public void setTextBlog(String textBlog) {
		TextBlog = textBlog;
	}

	public String getImageBlog() {
		return ImageBlog;
	}

	public void setImageBlog(String imageBlog) {
		ImageBlog = imageBlog;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Set<BlogComment> getBlogComment() {
		return blogComment;
	}

	public void setBlogComment(Set<BlogComment> blogComment) {
		this.blogComment = blogComment;
	}
	
	
	
	// ---------------------------------------------------- ToString ---------------------------------------------------------------	

	

	

	@Override
	public String toString() {
		return "Blog [IdBlog=" + IdBlog + ", IdUser=" + IdUser + ", TitleBlog=" + TitleBlog + ", DateBlog=" + DateBlog
				+ ", TextBlog=" + TextBlog + ", ImageBlog=" + ImageBlog + "]";
	}
	
	

}
