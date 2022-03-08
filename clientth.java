import java.net.*;
import java.io.*;
public class clientth
{
        
    public static void main(String argv[]){
    int i = 0;
    int port = 2222;    
    String adr = "localhost";
    //initializing the port and the ip adreese
try {
InetAddress adr = InetAddress.getByName(host);
Socket socket = new Socket(adr , port); // posiiton the listening socket
ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());   // object stream to communicate with the server (send)
ObjectInputStream input = new ObjectInputStream(socket.getInputStream()); //stream to receive response from the server
output.writeObject("bonjour");
String ch = (String) input.readObject(); #receiving the response from the server after checking the duplications in the table
System.out.println("the server adress : "+socket.getInetAddress()+ " : " +socket.getPort()); // server informations
System.out.println("my adresse :  "+socket.getLocalAddress()+ " : " +socket.getLocalPort()); // local informations



}
catch(Exception e){

    System.err.println("Error :"+e);#raising an error in case of error in any kind appearing above 
}
}
}
