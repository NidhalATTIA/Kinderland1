package tn.esprit.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tn.esprit.spring.entity.Notification;
import tn.esprit.spring.repository.NotificationRepository;


@Service
public class NotificationServiceImp implements INotificationService{
	@Autowired
	NotificationRepository notificationRepository;
	
	public static final Logger l = LogManager.getLogger(InvitationServiceImpl.class);
	
	@Override
	public Notification AddNotification(Notification notification) {
		return notificationRepository.save(notification);
		
	}

	@Override
	public List<Notification> GetAllNotificationJPQL() {
		return (List<Notification>) notificationRepository.findAll();
		
	}

	@Override
	public Notification GetNotificationById(Long notificationId) {
		Notification Invitation = notificationRepository.findById(notificationId).orElse(null);
		l.info("retrive blog by id +++++;" + Invitation);
		return Invitation;
	}

	@Override
	public Notification UpdateNotification(Notification notification) {
		return notificationRepository.save(notification);
	}

	@Override
	public void DeleteNotification(Long notificationId) {
	
		notificationRepository.deleteById(notificationId);
	}

}
