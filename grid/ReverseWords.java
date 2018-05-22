package PracticeAlgorithms;

import java.util.Scanner;
import java.util.Stack;

public class ReverseWords {
  
  
   static void reverse(String str){
    
    Stack<Character> stack = new Stack<Character>();
    
    for(int i =0 ; i<str.length();i++)
    {
        
      if(str.charAt(i) != ' ')
      {
        stack.push(str.charAt(i));
        
      }
      else{
        
        while(stack.empty() == false){
        System.out.print(stack.pop());
        
      }
        
        System.out.print(" ");
        
      }
        
    }
    
    System.out.print(' ');
    
    while(stack.empty() == false){
      System.out.print(stack.pop());
    }
    
    
  }

  public static void main(String[] args) {
    
//    Scanner sc = new Scanner(System.in);
//    String str = "";
//    
//    while(sc.hasNext())
//    {
//      str = sc.next();
//    }
    

    String str = "vinjam manoj kumar naidu";
    
    reverse(str);
    
    
  }

}
