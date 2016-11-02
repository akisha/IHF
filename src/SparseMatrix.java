import java.util.HashMap;
import java.util.Map;

public class SparseMatrix extends Matrix{
    String inF;
    int rows;
    int cols;
    double[][] matrix = new double[rows][cols];

    SparseMatrix (String fileName){
        inF = fileName;
        rows = cRow(fileName);
        cols = cCol(fileName);
        matrix = setMatrix(rows, cols, fileName);
    }

    SparseMatrix (int m, int n, String fileName){
        inF = fileName;
        rows = m;
        cols = n;
        matrix = new double[rows][cols];
    }

    public SparseMatrix multSpSp(SparseMatrix other) {
        if (cols != other.rows) throw new IllegalArgumentException("Dimensions disagree");
        SparseMatrix result = new SparseMatrix(rows, other.cols, other.inF);
        Map<Integer, HashMap<Integer, Double>> tOther = new HashMap<>();
        for(int k = 0; k < cols; k++) {
            tOther.put(k, new HashMap<Integer, Double>());
            for(int j = 0; j < other.cols; j++) {
                if (other.matrix[k][j] != 0){
                    tOther.get(k).put(j, other.matrix[k][j]);
                }
            }
        }
        for(int i = 0; i < rows; i++) {
            for(int k = 0; k < cols; k++) {
                if (matrix[i][k] != 0){
                    for (Integer j: tOther.get(k).keySet()) {
                        result.matrix[i][j] += matrix[i][k] * tOther.get(k).get(j);
                    }
                }
            }
        }
        printMatrix(rows, other.cols, result.matrix, "mulSpSp" + inF.substring(0, inF.length() - 4) + other.inF);
        return result;
    }

    public SparseMatrix multSD(DenseMatrix other) {
        if (cols != other.rows) throw new IllegalArgumentException("Dimensions disagree");
        SparseMatrix result = new SparseMatrix(rows, other.cols, other.inF);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.cols; j++) {
                for (int k = 0; k < cols; k++) {
                    result.matrix[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        printMatrix(rows, other.cols, result.matrix, "mulSD" + inF.substring(0, inF.length() - 4) + other.inF);
        return result;
    }
}
