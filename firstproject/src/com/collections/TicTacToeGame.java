package com.collections;

import java.util.Scanner;

public class TicTacToeGame {
	static char[][] board = new char[3][3];
	static char player = 'X';

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Initialize board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}

		while (true) {
			printBoard();

			System.out.println("Player " + player + " turn");
			System.out.print("Enter row (0-2): ");
			int row = sc.nextInt();
			System.out.print("Enter col (0-2): ");
			int col = sc.nextInt();

			// Validate input
			if (row < 0 || row > 2 || col < 0 || col > 2 || board[row][col] != '-') {
				System.out.println("Invalid move! Try again.");
				continue;
			}

			// Place move
			board[row][col] = player;

			// Check win
			if (checkWin()) {
				printBoard();
				System.out.println("Player " + player + " wins!");
				break;
			}

			// Check draw
			if (isBoardFull()) {
				printBoard();
				System.out.println("Game Draw!");
				break;
			}

			// Switch player
			player = (player == 'X') ? 'O' : 'X';
		}

		sc.close();
	}

	static void printBoard() {
		System.out.println("-------");
		for (int i = 0; i < 3; i++) {
			System.out.println(board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
		}
		System.out.println("-------");
	}

	static boolean checkWin() {
		for (int i = 0; i < 3; i++) {
			// rows
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
				return true;

			// columns
			if (board[0][i] == player && board[1][i] == player && board[2][i] == player)
				return true;
		}

		// diagonals
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
			return true;

		if (board[0][2] == player && board[1][1] == player && board[2][0] == player)
			return true;

		return false;
	}

	static boolean isBoardFull() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}