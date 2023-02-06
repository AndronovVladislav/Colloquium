package MyMatrix;

public class Matrix {
    final int matrix[][];
    public int n;
    public int m;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new int[n][m];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void append(int x, int i, int j) {
        matrix[i][j] = x;
    }
}
