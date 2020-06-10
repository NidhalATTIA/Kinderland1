package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entity.Friendship;

public interface IFriendshipService {
	public Friendship AddFriendship(Friendship Friendships);

	public List<Friendship> GetAllFriendshipJPQL();

	public Friendship GetFriendshipById(Long FriendshipsId);

	public Friendship UpdateFriendship(Friendship Friendships);

	public void DeleteFriendship(Long FriendshipsId);
}
