package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Notification;

public interface INotificationService {
	public Notification AddNotification(Notification notification);

	public List<Notification> GetAllNotificationJPQL();

	public Notification GetNotificationById(Long notificationId);

	public Notification UpdateNotification(Notification notification);

	public void DeleteNotification(Long notificationId);
}
