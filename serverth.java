import java.net.*;
import java.io.*;
public class serverth extends Thread{private Socket socket ;
    public static void main(String argv[]){
try {
ServerSocket serversocket = new ServerSocket(2222); // position the listening socket
while(true)

{Socket socket = serversocket.accept();  //this method is a blocking one means that it will wait untill the client arrive to continue the excution of the rest
ServerTcp t = new ServerTcp(socketclient);
t.start();}}

catch(Exception e){

    e.printStackTrace();//an error will be raised in case of something wrong occured above
}
}
public serverth(Socket socket)
{this.socket = socket ;}
public void run(){
try{
ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());   // object stream to communicate with the server (send)
ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
String chaine = (String)input.readObject();
System.out.println("recu" +chaine);
output.writeObject("messag recu");
}
catch(Exception e){
System.err.println("Erreur :"+e);
}
}
} 
