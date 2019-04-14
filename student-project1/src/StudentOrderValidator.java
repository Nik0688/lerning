
public class StudentOrderValidator {

	public static void main(String[] args) {
		checkAll();
	}
	
	static void checkAll() {
		checkChildren();
		checkCityRegister();
		checkMarrige();
		checkStudent();
	}
	
	static void checkCityRegister() {
		System.out.println("City register is running");
	}
	
	static void checkMarrige() {
		System.out.println("Wedding запущен");
	}
	
	static void checkChildren() {
		System.out.println("Check Children is running");
	}
	
	static void checkStudent() {
		System.out.println("Check student");
	}

}
