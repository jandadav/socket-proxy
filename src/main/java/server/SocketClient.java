package server;

import java.net.*;
import java.io.*;
 
/**
  * This program is a socket client application that connects to a time server
  * to get the current date time.
  *
  * @author www.codejava.net
  */
public class SocketClient {

    public static void main(String[] args) {
        String hostname = "localhost";
        int port = 9090;
 
        try (Socket socket = new Socket(hostname, port)) {

            PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream())));

            out.println("GET /data.txt HTTP/1.0");
            out.println();
            out.flush();

            InputStream input = socket.getInputStream();
            InputStreamReader reader = new InputStreamReader(input);
 
            int character;
            StringBuilder data = new StringBuilder();
 
            while ((character = reader.read()) != -1) {
                data.append((char) character);
            }
 
            System.out.println(data);
 
 
        } catch (UnknownHostException ex) {
 
            System.out.println("Server not found: " + ex.getMessage());
 
        } catch (IOException ex) {
 
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}