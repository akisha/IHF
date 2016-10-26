public class DenseMatrix extends Matrix{

    public String inF;
    public int rows;
    public int cols;
    public double[][] matrix;

    public DenseMatrix(String fileName){
        inF = fileName;
        rows = cRow(fileName);
        cols = cCol(fileName);
        double[][] matrix = setMatrix(rows, cols, fileName);
    }

    public void mulDD(DenseMatrix other){
        DenseMatrix result = new DenseMatrix(other.inF);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < other.cols; j ++){
                result.matrix[i][j] = 0;
                for (int k = 0; k < cols; k++){
                    result.matrix[i][j] = result.matrix[i][j] + matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        printMatrixCons(rows, other.cols, result.matrix);
    }

}
