package tn.esprit.spring.controller;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


import tn.esprit.spring.entity.Role;
import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserInterface;
import tn.esprit.spring.service.UserService;

@Service
@Scope(value = "session")
@Controller(value = "AccuilController")
@ELBeanName(value = "AccuilController")
@Join(path = "/", to = "/login.jsf")  // @Join(path = "/", to = "/welcome.jsf")
public class AccuilController {
	
	private String login;
	private String password;
	private Boolean loggedIn;
	
	@Autowired
	UserInterface userService;
	public String doLogin() {
		String navigateTo = "null";
		User employe = userService.login(login, password);
		if (employe != null ) {
			if(employe.getRole()==Role.Nurse) {
			navigateTo = "/pages/nurse/welcome.xhtml?faces-redirect=true";}
			if(employe.getRole()==Role.Admin) {
				navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";}
			if(employe.getRole()==Role.Parent) {
				navigateTo = "/pages/parent/welcome.xhtml?faces-redirect=true";}
			if(employe.getRole()==Role.Teacher) {
				navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";}
			loggedIn = true;
		} else {
			FacesMessage facesMessage = new FacesMessage(
					"Login Failed: please check your username/password and try again.");
			FacesContext.getCurrentInstance().addMessage("form:btn", facesMessage);
		}
		return navigateTo;
	}
	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.xhtml?faces-redirect=true";
	}
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}



	
}
