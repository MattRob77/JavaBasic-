// Print all permutations of a string in Java
//
// Sample Input	Sample Output	Explanation
// cd	cd dc	Explanation : All possible permutation cd dc


//write imports
import java.util.*;
class Solution {
/* This code must not be changed - start*/
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String inputString = s.nextLine();
    String input1 = "";
    solution(inputString,input1);
    //System.out.println(result);
  }
/* This code must not be changed - end */

 public static void solution(String str, String ans ) {
    if(str == null || str.length() ==0) {
        System.out.printIn("Needs string length > 0.")
            return;
    }
     permute("",str);
  }
}







//write imports
import java.util.*;
class Solution {
/* This code must not be changed - start*/
   public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    String inputString = s.nextLine();
    String input1 = "";
    solution(inputString,input1);
    //System.out.println(result);
  }
/* This code must not be changed - end */

 public static void solution(String str, String ans ) {
    
  }
}
