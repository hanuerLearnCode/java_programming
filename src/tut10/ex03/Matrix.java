package tut10.ex03;
import java.io.*;
import java.util.Arrays;

public class Matrix {
    public double[][] data;
    public int rows, cols;

    // Constructor
    public Matrix(int n, int m) {
        data = new double[n][m];
        rows = n;
        cols = m;
    }

    // Save matrix to a file
    public void save(String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        PrintWriter pw = new PrintWriter(fos);
        pw.println(rows + " " + cols); // Write dimensions
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                pw.print(data[i][j] + " ");
            }
            pw.println();
        }
        pw.close();
    }

    // Read matrix from a file
    public static Matrix read(String filename) throws IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String[] dimensions = br.readLine().split(" ");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        Matrix matrix = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            String[] rowValues = br.readLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix.data[i][j] = Double.parseDouble(rowValues[j]);
            }
        }
        br.close();
        return matrix;
    }

    // Sum of two matrices
    public Matrix sum(Matrix m) {
        if (rows == m.rows && cols == m.cols) {
            Matrix result = new Matrix(rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    result.data[i][j] = data[i][j] + m.data[i][j];
                }
            }
            return result;
        } else {
            return null; // Matrices have different dimensions
        }
    }

    // Product of two matrices
    public Matrix product(Matrix m) {
        if (cols == m.rows) {
            Matrix result = new Matrix(rows, m.cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < m.cols; j++) {
                    double sum = 0;
                    for (int k = 0; k < cols; k++) {
                        sum += data[i][k] * m.data[k][j];
                    }
                    result.data[i][j] = sum;
                }
            }
            return result;
        } else {
            return null; // Matrices have incompatible dimensions
        }
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "data=" + Arrays.toString(data) +
                ", rows=" + rows +
                ", cols=" + cols +
                '}';
    }
}
