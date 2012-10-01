package ca.nait.dmit.controller;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;

import util.Gmail;
import util.JSFUtil;

@ManagedBean(name="contactUsBean")
@RequestScoped

//@SessionScoped
//@ApplicationScoped
public class ContactUsController {
	private String name;
	private String emailAddress;
	private String message;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void sendMessage()
	{
		String gmailUsername = JSFUtil.getInitParameter("gmail.username");
		String gmailPassword = JSFUtil.getInitParameter("gmail.password");
		
		Gmail sendmail = new Gmail(gmailUsername, gmailPassword);
		try {
			sendmail.sendmail(
					gmailUsername, 
					emailAddress, 
					"Message from " + name, 
					message);
			JSFUtil.addInfoMessage("Successfully sent message.");
			// add the code to send an email to the user that
			// the message has been received and they should
			// expect a response within 48 hours.

			// clear the text in the web form
			
		} catch (Exception e) {
			JSFUtil.addErrorMessage("Server error. Please try again later.");
		}
		
	}
	

}
