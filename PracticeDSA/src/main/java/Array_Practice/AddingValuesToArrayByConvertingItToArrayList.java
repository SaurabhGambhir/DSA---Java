package Array_Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingValuesToArrayByConvertingItToArrayList {
    public static void main(String[] args) {
        // Step 1: Original array
        int[] oldArray = {1, 2, 3, 4, 5, 6};

        // Step 2: Convert to ArrayList
        List<Integer> list = new ArrayList<>();
        for (int num=0; num<oldArray.length; num++) {
            list.add(num);
        }
        

        // Step 3: Add elements at specific indices
        list.add(6, 10); // to add an element at '6'th index in list
        list.add(7, 20); // index 7
        list.add(8, 30); // index 8
        list.add(10);

        ArrayList <Integer> list2 = new ArrayList<>(5);
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(500);
        list2.add(600);
        
        System.out.println(list2);
        
      //  list.clear(); to clear all elements from list 
        list.addAll(list2); // to add list 1 and list 2
        
            System.out.println (list.contains(10000));
        
           System.out.println(list.indexOf(3)); 
            System.out.println(list.lastIndexOf(10));
            
        // Step 4: Convert back to int[]
        int[] newArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            newArray[i] = list.get(i); // to get an element at 'i'th index in list
        }

        // Step 5: Print result
        System.out.println(Arrays.toString(newArray));
    }
}