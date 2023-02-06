package org.example;

import MyMatrix.Matrix;
import MyMatrix.UpLevelFunctions;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Matrix fancyMatrix = new Matrix(2, 2);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                fancyMatrix.append(i, j, i + j);
            }
        }

        System.out.println(UpLevelFunctions.determinant(fancyMatrix));
    }
}