package ca.nait.dmit.controller;

public class BMI {
	private int weight;
	private int height;
 
	public BMI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BMI(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double getBMI(){
		return 703 * weight / Math.pow(height, 2) ;
	}
	

	public String getBMICategory(){
		 double BMIvalue= getBMI();
		 String Message;
		if(BMIvalue<18.5){
			Message="underweight";
		}
		else if (BMIvalue>=18.5 && BMIvalue<25){
			Message="normal";
		}
		else if (BMIvalue>=25 && BMIvalue<30){
			Message="overweight";
		}
		else {
			Message="obese";
		}
		return Message;
	}

}
