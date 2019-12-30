import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class CollectionSorting {


	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		List<Employee> emp= new ArrayList<Employee>();
		
	
		
		while(true) {
			
			System.out.println("1.Add New Employee/n2.Delete Employee Record/n3.Show All Employee/n4.Sort/n5.Exit");	
			
			int choice=sc.nextInt();
			switch(choice){
			
			case 1:
				System.out.println("enter values");	
				System.out.println("id");
				int id1=sc.nextInt();
				
				System.out.println("age");
				int age1=sc.nextInt();
				
				System.out.println("name");
				String name1=sc.next();
				
				System.out.println("salary");
				double sal=sc.nextDouble();
				
				emp.add(new Employee(id1, age1, name1, sal));
				
				break;
			
			
			case 2:
				System.out.println("enter position to be deleted");
				int i=sc.nextInt();
				emp.remove(i);
				
				break;
				
			case 3:
				System.out.println(emp+"\n");
				break;
				
			case 4:
				 Collections.sort(emp, new SortByRoll());
				 System.out.println("\nSorted by rollno"); 
			        for (int i1=0; i1<emp.size(); i1++) 
			            System.out.println(emp.get(i1));
				break;
				
				
			case 5:
			 return;
			
			
			}
			
			
			
			
		}
		

	
	
	
	
	}


}
