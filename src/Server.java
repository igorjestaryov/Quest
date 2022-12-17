import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        while (true){
            Socket clientSocket = serverSocket.accept();
            System.out.println("Тверь");
            OutputStreamWriter writer = new OutputStreamWriter(clientSocket.getOutputStream());
            writer.write("x-18=33");
            writer.flush();
            writer.close();
            clientSocket.close();
        }
    }
}