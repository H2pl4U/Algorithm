package leetcode;

import java.util.ArrayList;

public class Array11 {

	public static void main(String[] args) {
		char[][] c={
	            {'5','3','.','.','7','.','.','.','.'},
	            {'6','.','.','1','9','5','.','.','.'},
	            {'.','9','8','.','.','.','.','6','.'},
	            {'8','.','.','.','6','.','.','.','3'},
	            {'4','.','.','8','.','3','.','.','1'},
	            {'7','.','.','.','2','.','.','.','6'},
	            {'.','6','.','.','.','.','2','8','.'},
	            {'.','.','.','4','1','9','.','.','5'},
	            {'.','.','.','.','8','.','.','7','9'}
	          };
		System.out.println(isValidSudoku(c));
		
	}
	static boolean isValidSudoku(char[][] board) {
		ArrayList<Character> list1 = new ArrayList<Character>();
		ArrayList<Character> list2 = new ArrayList<Character>();
		ArrayList<Character> list3 = new ArrayList<Character>();
        for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if(board[i][j]!='.') {
					if(!list1.contains(board[i][j])) {
						list1.add(board[i][j]);
					}else {
						System.out.println("0");
						return false;
					}
				}
				if(board[j][i]!='.') {
					if(!list2.contains(board[j][i])) {
						list2.add(board[j][i]);
					}else {
						System.out.println("00");
						return false;
					}
				}
			}
			list1.clear();
			list2.clear();
		}
       
		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < board.length; i++) {
				if(i<3) {
					if(board[i][j]!='.') {
						if(!list1.contains(board[i][j])) {
							list1.add(board[i][j]);
						}else {
							System.out.println(7);
							return false;
						}
					}
				}else if(i>=3&&i<6) {
					if(board[i][j]!='.') {
						if(!list2.contains(board[i][j])) {
							list2.add(board[i][j]);
						}else {
							System.out.println(8);
							return false;
						}
					}
				}else {
					if(board[i][j]!='.') {
						if(!list3.contains(board[i][j])) {
							list3.add(board[i][j]);
						}else {
							System.out.println(9);
							return false;
						}
					}
				}
			}
		}
		
		list1.clear();
		list2.clear();
		list3.clear();
		for (int j = 3; j < 6; j++) {
			for (int i = 0; i < board.length; i++) {
				if(i<3) {
					if(board[i][j]!='.') {
						if(!list1.contains(board[i][j])) {
							list1.add(board[i][j]);
						}else {
							for (Character c : list1) {
								System.out.println(c);
							}
							return false;
						}
					}
				}else if(i>=3&&i<6) {
					if(board[i][j]!='.') {
						if(!list2.contains(board[i][j])) {
							list2.add(board[i][j]);
						}else {
							System.out.println("2");
							return false;
						}
					}
				}else {
					if(board[i][j]!='.') {
						if(!list3.contains(board[i][j])) {
							list3.add(board[i][j]);
						}else {
							System.out.println("3");
							return false;
						}
					}
				}
			}
		}
		list1.clear();
		list2.clear();
		list3.clear();
		for (int j = 6; j < 9; j++) {
			for (int i = 0; i < board.length; i++) {
				if(i<3) {
					if(board[i][j]!='.') {
						if(!list1.contains(board[i][j])) {
							list1.add(board[i][j]);
						}else {
							System.out.println("4");
							return false;
						}
					}
				}else if(i>=3&&i<6) {
					if(board[i][j]!='.') {
						if(!list2.contains(board[i][j])) {
							list2.add(board[i][j]);
						}else {
							System.out.println("5");
							return false;
						}
					}
				}else {
					if(board[i][j]!='.') {
						if(!list3.contains(board[i][j])) {
							list3.add(board[i][j]);
						}else {
							System.out.println("6");
							return false;
						}
					}
				}
			}
		}
		return true;
    }

}
