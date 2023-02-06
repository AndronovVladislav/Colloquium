package MyMatrix;

public class UpLevelFunctions {
    private UpLevelFunctions() {
    }

    public static Matrix inverseMatrix(Matrix matrix) {
        Matrix inverseMatrix = new Matrix(matrix.getN(), matrix.getM());
        // находим присоединённую матрицу с помощью LowLevelFunctions
        // находим определитель с помощью той же
        return inverseMatrix;
    }

    public static Matrix solveCramer(Matrix matrix) {
        Matrix solutionVector = new Matrix(1, matrix.getM() - 1);
        // последовательно вызывает более низкоуровневый cramerStep
        // тем самым получая y_i(очередной элемент решения)
        return solutionVector;
    }
    public static double determinant(Matrix matrix) {
        return LowLevelFunctions.determinant(matrix);
    }
}
