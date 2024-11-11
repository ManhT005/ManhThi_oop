package nguoilamcong;

public class Employee extends Person {

	private String employerName;
	private String hiredDate;

	// constructor
	public Employee() {
		super();
		this.employerName = "";
		this.hiredDate = "";
	}

	public Employee(String name, int age, char gender, String employerName, String hiredDate) {
		super(name, age, gender);
		this.employerName = employerName;
		this.hiredDate = hiredDate;
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
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	@Override
	public String toString() {
		return "Employee [ "+super.toString()+", employerName=" + employerName + ", hiredDate=" + hiredDate + "]";
	}

	
}
