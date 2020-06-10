package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.BlogComment;
import tn.esprit.spring.repository.BlogCommentRepository;

@Service
public class BlogCommentServiceImpl implements BlogCommentService {

	@Autowired
	BlogCommentRepository blogcommentrepository;

	public static final Logger l = LogManager.getLogger(BlogCommentServiceImpl.class);

	// Ajout
	@Override
	public long AddBlogComment(BlogComment blogcomment) {
		blogcommentrepository.save(blogcomment);
		return blogcomment.getIdBlogComment();
	}

	// Affichage all
	
	@Override
	public List<BlogComment> GetAllBlogCommentJPQL() {
		return (List<BlogComment>) blogcommentrepository.findAll();
	}
	

	// Affichage 1
	@Override
	public BlogComment GetBlogCommentById(Long BlogCommentId) {
		BlogComment blogcomment = blogcommentrepository.findById(BlogCommentId).orElse(null);
		l.info("retrive blog by id +++++;" + blogcomment);
		return blogcomment;
	}

	// Modification
	@Override
	public void UpdateBlogComment(Long blogCommentId, String textBlogComment) {
		blogcommentrepository.UpdateBlogComment(textBlogComment, blogCommentId);
	}

	// Supression
	@Override
	public void DeleteBlogComment(Long BlogCommentId) {
		blogcommentrepository.deleteById(BlogCommentId);
	}

	

}
