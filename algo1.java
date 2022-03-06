import java.util.HashMap;
import java.util.*;
public class Main { 
    
     
    
  
  
  public static void encode(String texteClair){
    System.out.print("---> the encoding is : ");
			int l = texteClair.length();
      int convert;
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < l; i++) {
            convert = texteClair.charAt(i);
            System.out.print(convert);
			        
        }
   
	}

public static void decode(String texteChiffre){
        System.out.print("--> the decoding is : ");
  		  int num = 0;
          for (int i = 0; i < texteChiffre.length(); i++) {
   
              // Append the current digit
              num = num * 10 + (texteChiffre.charAt(i) - '0');
   
              // If num is within the required range
              if (num >= 32 && num <= 122) {
   
                  // Convert num to char
                  char ch = (char)num;
                  System.out.print(ch);
   
                  // Reset num to 0
                  num = 0;
              }
        }
	} 


  
    
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    System.out.print("do you want to : \n 0 -> encode \n 1 -> decode \n");  
    String choice = sc.nextLine();
    int g = Integer. parseInt(choice);
    if (g == 0) {
    System.out.print("Enter a string: ");
    String str= sc.nextLine(); 
    encode(str);
    
    }
    else { System.out.print("Enter your code: ");
    String str = sc.nextLine(); 
    decode(str);
    
    
    }}}
