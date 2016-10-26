import java.io.*;
import java.util.Scanner;

public class Matrix {

    public int cRow(String fileName){
        int n = 0;
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
            while (lineNumberReader.readLine() != null){
                n++;
            }
            lineNumberReader.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return n;
    }

    public int cCol(String fileName){
        int n = 0;
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(fileReader);
            String reader;
            if (sc.hasNextLine()) {
                reader = sc.nextLine();
                n = reader.split(" ").length;
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return n;
    }

    public double[][] setMatrix(int m, int n, String fileName){
        double[][] matrix = new double[m][n];
        try{
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextDouble()){
                for (int i = 0; i < m; i++){
                    for (int j = 0; j < n; j++){
                        matrix[i][j] = sc.nextDouble();
                    }
                }
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        return matrix;
    }

    public void printMatrix (int m, int n, double[][] matrix, String fileName){
        try{
            File file = new File(fileName);
            FileWriter out = new FileWriter(file);
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++) {
                    out.write(matrix[i][j] + " ");
                }
                out.write("\n");
            }
            out.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void printMatrixCons (int m, int n, double[][] matrix){
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
