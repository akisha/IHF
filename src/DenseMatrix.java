public class DenseMatrix extends Matrix{

    public String inF;
    public int rows = 2;
    public int cols = 2;
    public double[][] matrix = new double[rows][cols];

    public DenseMatrix(String fileName){
        inF = fileName;
        rows = cRow(fileName);
        cols = cCol(fileName);
        double[][] matrix = setMatrix(rows, cols, fileName);
    }

    public void mulDD(DenseMatrix other){
        //ПЕРЕПИСАТЬ DenseMatrix result = new DenseMatrix(other.inF);!!! написать новый конструктор
        /*DenseMatrix result = new DenseMatrix(other.inF);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < other.cols; j ++){
                for (int k = 0; k < cols; k++){
                    result.matrix[i][j] = result.matrix[i][j] + matrix[i][k] * other.matrix[k][j];
                    System.out.println(matrix[i][k]);
                }
            }
        }*/
        printMatrixCons(rows, cols, matrix);
    }

}
