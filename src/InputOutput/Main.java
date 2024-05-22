package InputOutput;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // viet du lieu ra 1 file
            FileOutputStream fos = new FileOutputStream("tenfile.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            //
            dos.writeUTF("Minh Duc dep trai!");
            dos.flush();
            dos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fis = new FileInputStream("tenfile.txt");
            DataInputStream dis = new DataInputStream(fis);

            dis.read();
            dis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
