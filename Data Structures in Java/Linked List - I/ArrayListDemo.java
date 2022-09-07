import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String args[])
	{
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1, 80);
		
		//Print elements
		for(int i=0;i<arr.size();i++)
		{
			System.out.println(arr.get(i));
		}
		
		//enhanced for loop
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("Size = "+arr.size());
        	System.out.println("Get element of index 1 : "+arr.get(1));
	}
}


OutPut:
10
80
20
30
10
80
20
30
Size = 4
Get element of index 1 : 80
	
	
