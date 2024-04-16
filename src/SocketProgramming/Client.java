package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public Socket socket = null;
    public DataInputStream input = null;
    public DataOutputStream output = null;

    public Client(String address, int port) {
        try {
            socket = new Socket(address, port);
            input = new DataInputStream(System.in);
            output = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }

        String line = "";
        while (!line.equals("Over")) {
            try {
                line = input.readLine();
                output.writeUTF(line);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try {
            input.close();
            output.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 5000);
    }
}
