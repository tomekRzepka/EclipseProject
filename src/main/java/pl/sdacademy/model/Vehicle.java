package pl.sdacademy.model;

public class Vehicle implements Comparable<Vehicle> {

	public String engine;
	private int wheelsAmount;
	double weight;
	String name;

	public Vehicle() {

	}

	public Vehicle(String engine, int wheelsAmount, double waight) {
		this.engine = engine;
		this.wheelsAmount = wheelsAmount;
		this.weight = weight;

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

	@Override
	public String toString() {
		return "Vehicle [weight=" + weight + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Vehicle pojazdDoPorownania) {
		return Double.compare(this.getWeight(), pojazdDoPorownania.getWeight());

	}

}
