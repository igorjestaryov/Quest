import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        {try (Socket clientSocket = new Socket("127.0.0.1", 8000)){
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            System.out.println(message);
        }catch (IOException e){
            System.out.println("Error 404");
            }
        }
    }
}