package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.Friendship;
import tn.esprit.spring.service.IFriendshipService;

@RestController
public class FriendShipController {

	@Autowired
	IFriendshipService friendshipService;
	
	@GetMapping("/retrieve-all-friendships")
	@ResponseBody
	public List<Friendship> getinvs() {
		List<Friendship> list = friendshipService.GetAllFriendshipJPQL();
		return list;
	}
	
	@GetMapping("/rmv-friendship")
	@ResponseBody
	public void rmvInv() {
		friendshipService.DeleteFriendship((long)2);
	}
	
	@GetMapping("/find-friendship")
	@ResponseBody
	public Friendship findinv() {
		return friendshipService.GetFriendshipById((long) 2);
	}
	@GetMapping("/Add-friendship")
	@ResponseBody
	public Friendship AddFriend(Friendship friendship) {
		return friendshipService.AddFriendship(friendship);
	}
}
