import java.io.*;
import java.util.Scanner;

public abstract class Matrix {

    public String inF;
    public int rows;
    public int cols;
    public double[][] matrix = new double[rows][cols];

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
            Scanner sc = new Scanner(file);
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    matrix[i][j] = sc.nextDouble();
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


    public boolean equals(Object o) {
        Matrix other = (Matrix)o;
        boolean eq = true;
        if (this.rows == other.cols && this.cols == other.cols) {
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < this.cols; j++) {
                    if (this.matrix[i][j] != other.matrix[i][j])
                        eq = false;
                }
            }
        }
        else {
            eq = false;
        }
        return  eq;
    }
}
