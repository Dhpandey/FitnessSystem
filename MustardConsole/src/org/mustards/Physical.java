package org.mustards;

public abstract class Physical {
	private double distance;
	private double weight;
	private int time;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	abstract public ActivityType activityType();

	public Physical() {

	}
	
	
	
	public Physical(double distance, double weight) throws NegativeValueException {
		this.distance = distance;
		this.weight = weight;
		if(this.distance<0 || weight <0){
			throw new NegativeValueException("Negative value, not recognized");
		}
	}

	public double calculateCalories() {
	//	return this.getDistance() * this.getWeight();
		return 0;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
