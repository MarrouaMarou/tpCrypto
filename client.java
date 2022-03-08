import java.net.*;
import java.io.*;
public class tp1 {
        
    public static void main(String argv[]){
      
    int port = 2222;    
    String adr = "localhost";
    
try {
ServerSocket serversocket = new ServerSocket(adr , port); // positionne de socket d'ecoute
ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());   // recuperer les flux objets pour communiquer avec client
ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
int[][] tab = {1,2,3,4,5,6,7,8,9}; //attente du tableau venant de la part du client 
output.writeObject(tab);
String ch = (String) input.readObject(); // l'envoi 
System.out.println(ch)
}
catch(Exception e){

    System.err.println("Error :"+e);
}
}
}
