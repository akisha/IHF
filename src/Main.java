import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*int m = 2;
        int n = 2;
        double[][] matrix1 = new double[m][n];
        try{
            File file = new File("D1.txt");
            FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextDouble()){
                for (int i = 0; i < m; i++){
                    for (int j = 0; j < n; j++){
                        matrix1[i][j] = sc.nextDouble();
                    }
                }
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        double[][] matrix2 = new double[n][m];
        try{
            File file = new File("D2.txt");
            FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(fileReader);
            while (sc.hasNextDouble()){
                for (int i = 0; i < n; i++){
                    for (int j = 0; j < m; j++){
                        matrix2[i][j] = sc.nextDouble();
                    }
                }
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        double[][] result = new double[m][m];
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j ++){
                result[i][j] = 0;
                for (int k = 0; k < n; k++){
                    result[i][j] = result[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < m; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }*/
        DenseMatrix d1 = new DenseMatrix("D1.txt");
        d1.setMatrix(d1.rows, d1.cols, d1.inF);

        //DenseMatrix d2 = new DenseMatrix("D2.txt");
        //d1.mulDD(d2);
        //d1.printMatrixCons(d1.rows, d1.cols, d1.matrix);
        /*int m = 2;
        try{
            File file = new File("D1.txt");
            //FileReader fileReader = new FileReader(file);
            Scanner sc = new Scanner(file);
            for (int i = 0; i < m; i++) {
                System.out.print(sc.nextDouble());
            }
            sc.close();
        }catch(IOException e){
            e.printStackTrace();
        }*/
    }
}
