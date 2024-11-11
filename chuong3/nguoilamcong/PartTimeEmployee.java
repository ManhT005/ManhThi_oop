package nguoilamcong;

public class PartTimeEmployee extends Employee{

	private int hoursPerWeek;
	
	public PartTimeEmployee() {
		super();
		this.hoursPerWeek = 0;
	}
	public PartTimeEmployee(String name, int age, char gender, String employerName, String hiredDate, int hoursPerWeek) {
		super(name, age, gender, employerName, hiredDate);
		this.hoursPerWeek = hoursPerWeek;
	}
	// setter, getter
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
	public String getName() {
		return super.getName();
	}
	public void setName(String name) {
		super.setName(name);
	}

	public int getAge() {
		return super.getAge();
	}

	public void setAge(int age) {
		super.setAge(age);
	}

	public char getGender() {
		return super.getGender();
	}

	public void setGender(char gender) {
		super.setGender(gender);
	}

	public String getEmployerName() {
		return super.getEmployerName();
	}

	public void setEmployerName(String employerName) {
		super.setEmployerName(employerName);
	}

	public String getHiredDate() {
		return super.getHiredDate();
	}

	public void setHiredDate(String hiredDate) {
		super.setHiredDate(hiredDate);
	}
	@Override
	public String toString() {
		return "PartTimeEmployee [ "+super.toString()+ ", hoursPerWeek=" + hoursPerWeek + "]";
	}
	
}
