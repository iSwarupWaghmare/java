import java.util.Comparator;

class SortByRoll implements Comparator<Employee> 
{ 
    
	public int compare(Employee a, Employee b) {
		 return a.id - b.id; 
		
	} 
}
