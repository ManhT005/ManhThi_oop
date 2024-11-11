package nguoilamcong;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee();
		PartTimeEmployee pte = new PartTimeEmployee();
		System.out.println("Employee : ");
		e.setName("Worker A");
		System.out.println("Name :"+e.getName());
		e.setAge(23);
		System.out.println("Age :"+ e.getAge());
		e.setGender('M');
		System.out.println("Gender :" +e.getGender());
		e.setEmployerName("Boss A");
		System.out.println("Employer :" +e.getEmployerName());
		e.setHiredDate("11/1/2020");
		System.out.println("Hired date :"+ e.getHiredDate());
		
		System.out.println("Part Time Employee : ");
		pte.setName("Worker B");
		System.out.println("Name :"+pte.getName());
		pte.setAge(23);
		System.out.println("Age :"+ pte.getAge());
		pte.setGender('M');
		System.out.println("Gender :" +pte.getGender());
		pte.setEmployerName("Boss A");
		System.out.println("Employer :" +pte.getEmployerName());
		pte.setHiredDate("11/1/2020");
		System.out.println("Hired date :"+ pte.getHiredDate());
		pte.setHoursPerWeek(14);
		System.out.println("Hours working per week : "+ pte.getHoursPerWeek());
		
		// test toString
		System.out.println(e.toString());
		System.out.println(pte.toString());
		
		
	}
	
	
}
