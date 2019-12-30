
public class Employee {

int id,age;
String name;
double salary;

public Employee(int id, int age, String name, double salary) {
	super();
	this.id = id;
	this.age = age;
	this.name = name;
	this.salary = salary;
}


public String toString() {
	System.out.println("");
	return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", salary=" + salary + "]";
	
}


}
