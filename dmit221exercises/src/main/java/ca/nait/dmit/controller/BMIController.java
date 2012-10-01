package ca.nait.dmit.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
//import javax.faces.event.ActionListener;

import util.JSFUtil;

//import util.Gmail;
//import util.JSFUtil;

@ManagedBean(name="bmiBean")
@RequestScoped


public class BMIController {

	private BMI bmi=new BMI();
	private String weight;
	private String height;
	private String message;
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public BMI getBmi() {
		return bmi;
	}
	public void setBmi(BMI bmi) {
		this.bmi = bmi;
	}

	public void calculateBMI()
	{

		JSFUtil.addInfoMessage("Your BMI is: " 
				+ bmi.getBMI() 
				+ ". Your are categorized as " 
				+ bmi.getBMICategory()
				);
	}
	
}
