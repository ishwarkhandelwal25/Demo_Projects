
public class CustomDTO {

	@JsonField
	private String name;

	private int salary;
	
	@JsonField
	private float f;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public float getF() {
		return f;
	}

	public void setF(float f) {
		this.f = f;
	}
	
	

}
