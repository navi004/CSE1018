
import java.util.*;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(9);
        nums.add(3);
        nums.add(1);
    
        Iterator<Integer> itr = nums.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println(nums.contains(9));
        //To check if element 9 is present in our list - true/false answer
        nums.remove(1);
        //To remove the element 9 from the list
        
        System.out.println("Is 9 present in list : " + nums.contains(9));
        
         nums.set(0,8);
        //To update the element at index 1 from 10 to 8
        
        System.out.println("Is 10 present in the list : " + nums.contains(10));
        //Checking if 10 is updated in the list to 8

        System.out.println("size of the list :" + nums.size());
        //To get the size of the list

        System.out.println("Printing the elements in the list :");
        for(int n : nums) {
            System.out.println(n);
        }
        
        nums.clear();
        //To clear all the elements in the list
        nums.isEmpty();
        
        System.out.println(nums.get(2));
        //To retrieve the element at index at 2
        
        System.out.println(nums.indexOf(1));

    }
}
