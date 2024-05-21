package tut10.ex01;

import java.io.*;

public class XFile {

    public static byte[] read(String path) {
        try {
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (IOException e) {
//            e.getMessage();
            e.printStackTrace();
        }
        return new byte[0];
    }

    public static void write(String path, byte[] data) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Ex02
     */
    public static Object readObject(String path){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object obj = ois.readObject();
            ois.close();
            return obj;

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public  static  void writeObject (String path, Object obj) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(obj);
            oos.close();
            System.out.println("Write obj done!");
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
