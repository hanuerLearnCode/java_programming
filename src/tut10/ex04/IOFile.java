package tut10.ex04;

import java.io.*;

public class IOFile {

    public String filename;

    // Constructor
    public IOFile(String filename) {
        this.filename = filename;
    }

    // Count lines in the file
    public int countLines() throws IOException {
        int lines = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }

    // Write file content to an OutputStream
    public void write(OutputStream os) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        }
    }

    // Print file content to the screen
    public void print() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    // Copy file content to another file
    public void copy(String destinationFilename) throws IOException {
        try (FileInputStream fis = new FileInputStream(filename);
             FileOutputStream fos = new FileOutputStream(destinationFilename)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    // Delete the file
    public void delete() {
        File file = new File(filename);
        if (file.exists()) {
            file.delete();
        }
    }
}

