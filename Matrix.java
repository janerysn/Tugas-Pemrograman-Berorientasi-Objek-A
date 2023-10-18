package OperasiPerhitungan_Matriks;
public class Matrix {
    private int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public Matrix add(Matrix other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix subtract(Matrix other) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] - other.matrix[i][j];
            }
        }

        return new Matrix(result);
    }

    public Matrix dot(Matrix other) {
        int rows = matrix.length;
        int cols = other.matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    sum += matrix[i][k] * other.matrix[k][j];
                }
                result[i][j] = sum;
            }
        }

        return new Matrix(result);
    }

    public Matrix transpose() {
        int rows = matrix[0].length;
        int cols = matrix.length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return new Matrix(result);
    }

    public Matrix inverse() {
        // Implementasi invers matriks di sini

        // Sementara ini mengembalikan matriks asli sebagai contoh
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sb.append(matrix[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        // Operasi penjumlahan
        Matrix additionResult = matrix1.add(matrix2);
        System.out.println("Hasil Penjumlahan:");
        System.out.println(additionResult);

        // Operasi pengurangan
        Matrix subtractionResult = matrix1.subtract(matrix2);
        System.out.println("Hasil Pengurangan:");
        System.out.println(subtractionResult);

        // Operasi dot matriks
        Matrix dotProductResult = matrix1.dot(matrix2);
        System.out.println("Hasil Dot Matriks:");
        System.out.println(dotProductResult);

        // Operasi transpose
        Matrix transposeResult = matrix1.transpose();
        System.out.println("Hasil Transpose:");
        System.out.println(transposeResult);

        // Operasi invers
        Matrix inverseResult = matrix1.inverse();
        System.out.println("Hasil Invers:");
        System.out.println(inverseResult);
    }
}
