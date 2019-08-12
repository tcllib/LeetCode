package algorithm.hashtable;

import java.util.HashSet;
import java.util.Set;

public class Suduko {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++) {
            if(!validateArray(board[i])){
                return false;
            }
        }



        return true;
    }

    private boolean validateArray(char[] array) {
        Set<Integer> set = new HashSet<>();
        for(char num: array) {
            if('.' == num) {
                continue;
            }

            if(set.contains(num)) {
                return false;
            }
        }

        return true;
    }
}
