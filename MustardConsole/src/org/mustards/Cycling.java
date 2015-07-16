package org.mustards;

public class Cycling extends Physical {

	private int time;

	public double getAge() {
		return time;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public double level;

	public Cycling(double distance, double weight, double age, double level) throws NegativeValueException {
		super(distance, weight);
		this.level = level;
	}

	@Override
	public ActivityType activityType() {
		return ActivityType.CYCLING;
	}

	@Override
	public double calculateCalories() {
		if (this.getTime() == 0) {
			return super.calculateCalories() * level / 2 * 0.72;
		} else
			return super.calculateCalories() * level / 2 * 0.57 * this.getTime();
	}

}
