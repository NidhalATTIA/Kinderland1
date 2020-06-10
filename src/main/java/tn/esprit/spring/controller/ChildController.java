package tn.esprit.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.esprit.spring.entity.Child;
import tn.esprit.spring.entity.ForumPost;
import tn.esprit.spring.service.IChildService;


public class ChildController {
	@Autowired
	IChildService ChildService;
	
	@GetMapping("/retrieve-all-children")
	@ResponseBody
	public List<Child> getChild() {
		List<Child> list = ChildService.GetAllChildJPQL();
		return list;

	}
	@PostMapping("/Add-child")
	@ResponseBody
	public void AddChild(@RequestBody Child ch) {
	
		 ChildService.AddChild(ch);
	}
	@PutMapping("/Edit-child")
	@ResponseBody
	public void EditChild(@RequestBody Child ch) {
	
		 ChildService.UpdateChild(ch);
	}
	
	@DeleteMapping("/rmv-child")
	@ResponseBody
	public void rmvChild() {
		ChildService.DeleteChild((long)2);
	}
	
	@GetMapping("/find-child")
	@ResponseBody
	public Child findChild() {
		return ChildService.GetChildById((long) 2);
	}
}
