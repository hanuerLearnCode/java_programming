package SocketProgramming;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server has to be executed first
 */
public class Server {
    public ServerSocket server = null;
    public Socket serverSocket = null;
    public DataInputStream input = null;

    public Server(int port) {
        try {
            // create a socket server at the port number
            server = new ServerSocket( port);
            System.out.println("Server started");
            System.out.println("Waiting for request...");

            // accept request from the client socket
            serverSocket = server.accept();
            // read data from client
            input = new DataInputStream(new BufferedInputStream(serverSocket.getInputStream()));
            String line = "";
            // if "over" hasn't been detected, keep the connection alive
            while (!line.equals("Over")) {
                try {
                    line = input.readUTF();
                    System.out.println(line);
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
            // close the connection
            System.out.println("Closing connection...");
            serverSocket.close();
            input.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5000);
    }
}
