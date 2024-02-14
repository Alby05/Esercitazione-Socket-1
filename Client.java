import java.net.*;
import java.io.*;

public class Client {
    public static void main (String[] args) throws IOException {
        String hostName = "Localhost"; // Indirizzo del server
        int port = 12345; // Porta del server
        try (Socket socket = new Socket (hostName, port);
            BufferedReader in = new BufferedReader (
                new InputStreamReader(socket.getInputStream()))) {
            String fromServer;
            while((fromServer = in.readLine()) != null) {
                System.out.println("Server:" + fromServer);
                break; //Uscine dal loop dopo aver nicevuto il messaggio
            }
        }
    }
}