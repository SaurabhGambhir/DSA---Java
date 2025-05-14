package Array_Practice;
// find majority element in the given array
public class Mejority_Element {

	public static void main(String[] args) {
		int Arr[] = {1,2,1,2,2,2,2,1,3};
		
		for(int i = 0; i < Arr.length; i++) {
			int count = 0;
			
			for (int j = 0; j < Arr.length; j++){
				if (Arr[j]==Arr[i])
				{
						count++;
						}	
			}
			if (count> Arr.length/2)
				  System.out.println("Majority element: " + Arr[i]);
           
				}
		
		}
		

	}

