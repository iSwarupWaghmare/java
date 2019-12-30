

public class Demo {

	public static void main(String args[])
	{
		
		try{
		
			int arr[]=new int[5];
			
			arr[4]=10;
			System.out.println(arr[4]);
			
			}catch(ArrayIndexOutOfBoundsException e)
		{
				System.out.println("Trying to fetch value which is out of array size ");
		}
		
		
		
		try{
			String s="12";
			int i=Integer.parseInt(s);
			System.out.println(i);
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Enter only integer values inside string");
		}
		
		
		
		
		try{
			String d="";
			
			int c1=d.length();
			System.out.println(c1);
		}
		catch(NullPointerException e2)
		{
			System.out.println("String has no value");
		}
		
		
	}
}
