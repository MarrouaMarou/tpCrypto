import java.util.HashMap;
import java.util.*;
public class Main { 
    
     
    public static String encode(Map<String, String> myMap , String texteClair){
        
        Map<String, String> myEncodingMap = new HashMap<>();
		for(Map.Entry<String, String> entry : myMap.entrySet()){  
			myEncodingMap.put(entry.getValue(), entry.getKey());
		}
 

		StringBuilder sb = new StringBuilder();
    String l = texteClair.replaceAll("W", "V");
		char[] letter =l.toCharArray();
		for (char c : letter) {
			String encodedChar = myEncodingMap.get(String.valueOf(c));
			if(encodedChar != null){
				sb.append(encodedChar);
			}else {
				sb.append(c);
			}
		}

    return sb.toString();
	}

  public static String decode(Map<String, String> myMap , String texteChiffre){
      Map<String, String> myEncodingMap = new HashMap<>();
		for(Map.Entry<String, String> entry : myMap.entrySet()){
			myEncodingMap.put(entry.getKey(), entry.getValue());
		}
		    String chiffreArrayString = texteChiffre.replaceAll(" ", "");
		 StringBuilder clair = new StringBuilder();
		//Convert string numbers to cha array 
	    	int k = 0;
		    int l = 0;
		    char[] chiffreArrayChar = chiffreArrayString.toCharArray(); 
		 
		//Define an integer array based on size of original numbers 
		    int[] jcdIntegerArray = new         int[chiffreArrayString.length()/2]; 
		    String[] separatedChiffre = new String[chiffreArrayString.length()/2]; 
		    int i = 0; 
        int j = i ;
		//For loop to populate integer array 
		    for (i = 0; i < chiffreArrayString.length()/2; i=i+1) { 
		          StringBuffer sb = new StringBuffer();
		          k = (int)chiffreArrayChar[j] - 48 ;
			        l = (int)chiffreArrayChar[j+1] - 48 ; 
			        sb.append(k).append(l);
			        String a = sb.toString();
			        separatedChiffre[i] = a;
			        j = j + 2;
		          } 
        for (String c : separatedChiffre) {
              String encodedChar =     myEncodingMap.get(String.valueOf(c));
			        clair.append(encodedChar);
			              }
          
        
		 
		return clair.toString();
 
	} 

		
    
    public static void main(String[] args) {
        String[][] tabLettres = { { "A", "B", "C", "D", "E" },
				{ "F", "G", "H", "I", "J" }, { "K", "L", "M", "N", "O" },
				{ "P", "Q", "R", "S", "T" }, { "U", "V", "X", "Y", "Z" } };
        Map<String,String> myMap = new HashMap<String,String>();
		for (int i = 0; i < tabLettres.length; i++) {
			String[] lineLettre = tabLettres[i];
			for (int j = 0; j < lineLettre.length; j++) {
				String key = i+""+j;
				myMap.put(key,lineLettre[j]);
			}
		}
    Scanner sc= new Scanner(System.in);
    System.out.print("do you want to : \n 0 -> encode \n 1 -> decode \n");  
    String choice = sc.nextLine();
    int g = Integer. parseInt(choice);
    if (g == 0) {
    System.out.print("Enter a string: ");
    String sttr= sc.nextLine(); 
    String str = sttr.toUpperCase();
    String code = encode(myMap , str);
    System.out.print("---> the encoding is : "+code+"\n");
    String decodage = decode(myMap , code);
    System.out.print("---> the decoding is : "+decodage);
    System.out.print(" |   or : "+decodage.replaceAll("V", "W")+"\n");
    }
    else { System.out.print("Enter your code: ");
    String str = sc.nextLine(); 
    String decodage = decode(myMap , str);
    System.out.print("---> the decoding is : "+decodage+"\n");
    System.out.print(" |  or : "+decodage.replaceAll("V", "W")+"\n");
    String encodage = encode(myMap , decodage);
    System.out.print("---> the encoding is : "+encodage+"\n");
    }}}
