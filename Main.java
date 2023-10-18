package OperasiPerhitungan_Matriks;
public class Main {
    public static class Pecahan {
        private int numerator;
        private int denominator;

        public Pecahan(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public Pecahan add(Pecahan other) {
            int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Pecahan(newNumerator, newDenominator);
        }

        public Pecahan subtract(Pecahan other) {
            int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
            int newDenominator = this.denominator * other.denominator;
            return new Pecahan(newNumerator, newDenominator);
        }

        public Pecahan multiply(Pecahan other) {
            int newNumerator = this.numerator * other.numerator;
            int newDenominator = this.denominator * other.denominator;
            return new Pecahan(newNumerator, newDenominator);
        }

        public Pecahan divide(Pecahan other) {
            int newNumerator = this.numerator * other.denominator;
            int newDenominator = this.denominator * other.numerator;
            return new Pecahan(newNumerator, newDenominator);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }

    public static class Matrix {
        private int[][] matrix;

        public Matrix(int[][] matrix) {
            this.matrix = matrix;
        }

        public Matrix add(Matrix other) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] newMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newMatrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
                }
            }
            return new Matrix(newMatrix);
        }

        public Matrix subtract(Matrix other) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] newMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newMatrix[i][j] = this.matrix[i][j] - other.matrix[i][j];
                }
            }
            return new Matrix(newMatrix);
        }

        public Matrix dot(Matrix other) {
            int rows = matrix.length;
            int cols = other.matrix[0].length;
            int[][] newMatrix = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    for (int k = 0; k < matrix[0].length; k++) {
                        newMatrix[i][j] += this.matrix[i][k] * other.matrix[k][j];
                    }
                }
            }
            return new Matrix(newMatrix);
        }

        public Matrix transpose() {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] newMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    newMatrix[j][i] = this.matrix[i][j];
                }
            }
            return new Matrix(newMatrix);
        }

        public Matrix inverse() {
            int rows = matrix.length;
            int cols = matrix[0].length;

            // Kode untuk menghitung invers matriks menggunakan metode adjoint
            // Implementasi metode adjoint di sini
            // ...

            int[][] newMatrix = new int[cols][rows]; // Ganti dengan hasil invers yang benar
            return new Matrix(newMatrix);
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
    }

    public static void main(String[] args) {
        // Operasi Pecahan
        Pecahan pecahan1 = new Pecahan(3, 4);
        Pecahan pecahan2 = new Pecahan(1, 2);

        Pecahan result = pecahan1.add(pecahan2);
        System.out.println("Penjumlahan Pecahan: " + result);

        result = pecahan1.subtract(pecahan2);
        System.out.println("Pengurangan Pecahan: " + result);

        result = pecahan1.multiply(pecahan2);
        System.out.println("Perkalian Pecahan: " + result);

        result = pecahan1.divide(pecahan2);
        System.out.println("Pembagian Pecahan: " + result);

        // Operasi Matrix
        int[][] data1 = {{1, 2}, {3, 4}};
        int[][] data2 = {{5, 6}, {7, 8}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        Matrix additionResult = matrix1.add(matrix2);
        System.out.println("Hasil Penjumlahan Matriks:");
        System.out.println(additionResult);

        Matrix subtractionResult = matrix1.subtract(matrix2);
        System.out.println("Hasil Pengurangan Matriks:");
        System.out.println(subtractionResult);

        Matrix dotProductResult = matrix1.dot(matrix2);
        System.out.println("Hasil Dot Product Matriks:");
        System.out.println(dotProductResult);

        Matrix transposeResult = matrix1.transpose();
        System.out.println("Hasil Transpose Matriks:");
        System.out.println(transposeResult);

        Matrix inverseResult = matrix1.inverse();
        System.out.println("Hasil Invers Matriks:");
        System.out.println(inverseResult);
    }
}
