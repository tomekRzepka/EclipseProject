package pl.sdacademy.model;

public class Vehicle {
	
	public	String engine;
	private	int wheelsAmount;
		double weight;
	
	

	public Vehicle() {
			
			
		
	}
	public Vehicle(String engine, int wheelsAmount, double waight){
		this.engine=engine;
		this.wheelsAmount=wheelsAmount;
		this.weight=weight;
		
	}



	public String getEngine() {
		return engine;
	}



	public void setEngine(String engine) {
		this.engine = engine;
	}



	public int getWheelsAmount() {
		return wheelsAmount;
	}



	public void setWheelsAmount(int wheelsAMount) {
		this.wheelsAmount = wheelsAMount;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}

}
