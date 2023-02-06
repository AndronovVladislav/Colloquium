package MyMatrix;

public class LowLevelFunctions {
    private LowLevelFunctions() {
    }

    public static Matrix algebraicAddition(Matrix matrix, int i, int j) {
        Matrix addition = new Matrix(matrix.getN(), matrix.getM());
        // считает нужный минор
        return addition;
    }

    public static double cramerStep(Matrix xs, Matrix b, int i) {
        int result = 0;
        // правильно вызывает columnSubstitution, берёт определитель от возвращённой матрицы
        // делит на определитель исходной матрицы и возвращает результат
        return result;
    }

    public static Matrix columnSubstitution(Matrix matrix, Matrix substitutor, int i) {
        Matrix newMatrix = new Matrix(matrix.getN(), matrix.getM());
        // заменяет i-ый столбец на substitutor
        return newMatrix;
    }

    public static double determinant(Matrix matrix) {
        int determinant = 0;
        // ищет прости господи определитель матрицы
        return determinant;
    }
}
