package com.zwf.LeetCode.twenty2fourty;

import java.util.HashSet;
import java.util.Set;

//要注意每9个小的九宫格也不能重复
public class ValidSudoku_36 {

	public boolean isValidSudoku(char[][] board) {
		Set<String> row = new HashSet<>();
		Set<String> col = new HashSet<>();
		Set<String> block = new HashSet<>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				char c = board[i][j];
				if (c == '.')
					continue;
				if (!row.add("" + i + c))
					return false;
				if (!col.add("" + j + c))
					return false;
				if (!block.add("" + (i / 3) + "num:" + c + (j / 3)))
					return false;
			}
		}
		return true;
	}

}
