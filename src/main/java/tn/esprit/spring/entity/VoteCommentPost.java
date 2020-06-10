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

@Entity
public class VoteCommentPost implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long IdVoteComment;
	
	@Column(name = "Ups")
	private int Ups;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private ForumPostComment forumPostComment;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	public long getIdVoteComment() {
		return IdVoteComment;
	}

	public void setIdVoteComment(long idVoteComment) {
		IdVoteComment = idVoteComment;
	}

	public int getUps() {
		return Ups;
	}

	public void setUps(int ups) {
		Ups = ups;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VoteCommentPost [IdVoteComment=" + IdVoteComment + ", Ups=" + Ups + ", forumPostComment="
				+ forumPostComment + ", user=" + user + "]";
	}
	
	
	
	

}
