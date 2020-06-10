package tn.esprit.spring.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Post;
import tn.esprit.spring.repository.MaladieRepository;
import tn.esprit.spring.repository.PostRepository;

@Service
public class PostServiceImp implements IPostService {
	@Autowired
	PostRepository postRepositary;
	
	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);
	
	@Override
	public Post AddPost(Post notification) {
		return postRepositary.save(notification);
		
	}

	@Override
	public List<Post> GetAllPostJPQL() {
		return (List<Post>) postRepositary.findAll();
		
	}

	@Override
	public Post GetPostById(Long notificationId) {
		Post Invitation = postRepositary.findById(notificationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	@Override
	public Post UpdatePost(Post notification) {
		return postRepositary.save(notification);
	}

	@Override
	public void DeletePost(Long notificationId) {
	
		postRepositary.deleteById(notificationId);
	}
}
