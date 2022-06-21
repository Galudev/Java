
public class Car {

	private String company;
	private int speed;
	
	public Car(String company, int speed) {
		super();
		this.company = company;
		this.speed = speed;
	}
	
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void getSpeed() {
		System.out.println(company + " car's speed is " + speed + " Km/hr");
	}
}
