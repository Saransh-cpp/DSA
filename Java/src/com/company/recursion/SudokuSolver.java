package com.company.recursion;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                { 8, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
                { 0, 7, 0, 0, 9, 0, 2, 0, 0 },
                { 0, 5, 0, 0, 0, 7, 0, 0, 0 },
                { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
                { 0, 0, 0, 1, 0, 0, 0, 3, 0 },
                { 0, 0, 1, 0, 0, 0, 0, 6, 8 },
                { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
                { 0, 9, 0, 0, 0, 0, 4, 0, 0 }
        };
        sudokuSolve(board, 0, 0);
    }

    public static void sudokuSolve(int[][] board, int row, int column) {
        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                System.out.println(Arrays.toString(board[i]));
            }
            return;
        }
        if (column == 9) {
            sudokuSolve(board, row + 1, 0);
            return;
        }
        if (board[row][column] == 0) {
            for (int i = 0; i <= 9; i++) {
                if (isSafe(board, row, column, i)) {
                    board[row][column] = i;
                    sudokuSolve(board, row, column + 1);
                    board[row][column] = 0;
                }
            }
        } else {
            sudokuSolve(board, row, column + 1);
        }

    }

    public static boolean isSafe(int[][] board, int row, int column, int element) {
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == element) {
                return false;
            }
        }

        for (int r = 0; r < 9; r++) {
            if (board[r][column] == element) {
                return false;
            }
        }

        int rowChunk = row / 3;
        int columnChunk = column / 3;

        for (int r = rowChunk * 3; r < (rowChunk + 1) * 3; r++) {
            for (int c = columnChunk * 3; c < (columnChunk + 1) * 3; c++) {
                if (board[r][c] == element) {
                    return  false;
                }
            }
        }

        return true;
    }
}
