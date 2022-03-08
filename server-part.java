import java.net.*;
import java.io.*;
public class tp1 {
        
    public static void main(String argv[]){
      
    int port = 2222;    
    
try {
ServerSocket serversocket = new ServerSocket(port); // positionne de socket d'ecoute
System.out.println("en attente des clients");      // mettre le serveur en attente de connexion avec client
Socket socket = serversocket.accept();  
ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());   // recuperer les flux objets pour communiquer avec client
ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
int[] tab = (int[])input.readObject();  //attente du tableau venant de la part du client 
System.out.println("bien recu le tableau ");
output.writeObject(doublon(tab));
System.out.println("ca vient de "+socket.getInetAddress()+ " : " +socket.getPort()); // les coordonnees du client 
System.out.println("mon adresse  "+socket.getLocalAddress()+ " : " +socket.getLocalPort()); // affichage du coordonnees
output.writeObject("Done"); // l'envoi 
}
catch(Exception e){

    System.err.println("Error :"+e);
}
}
static int verif(int tab[]){       // fonction du recherche d'un element dans un tableau
    boolean bool ; 
    for(int i = 0 ; i<tab.length ; i++){
        for ( int j = i ; j < tab.length ; j++){
            if(tab[i]==tab[j])
                {bool = true ;} 
            else {bool = false ; }
        }
    }
    return bool ; }
