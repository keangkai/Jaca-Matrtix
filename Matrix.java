/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.Random;

public class Matrix {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        final int ROW = 5000, COLUMN = 5000;
        // Matrix A
        int A[][] = new int[ROW][COLUMN];
        // Matrix B
        int B[][] = new int[ROW][COLUMN];
        int value = 0;
        
        // Assigning values
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                A[i][j] = (int)(Math.random() * 50 + 1);
                B[i][j] = (int)(Math.random() * 50 + 1);
            }
        }
        
        // Multiplication
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COLUMN; j++) {
                for (int k = 0; k < ROW; k++) {
                    value += A[i][k] * B[k][j];
                }
                System.out.print("\t" + value);
                //destroy value for dont keep value
                value = 0;
            }
            System.out.println();
        }
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Execution time : " + totalTime);
    }
}


