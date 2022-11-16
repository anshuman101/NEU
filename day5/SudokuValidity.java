package day5;

import java.util.Arrays;
import java.util.HashSet;

public class SudokuValidity {

    public static void main(String[] args) {
//        char[][] arr = {{'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}};

//        char[][] arr = {{'.','.','.','.','5','.','.','1','.'},
//                {'.','4','.','3','.','.','.','.','.'},
//                {'.','.','.','.','.','3','.','.','1'},
//                {'8','.','.','.','.','.','.','2','.'},
//                {'.','.','2','.','7','.','.','.','.'},
//                {'.','1','5','.','.','.','.','.','.'},
//                {'.','.','.','.','.','2','.','.','.'},
//                {'.','2','.','9','.','.','.','.','.'},
//                {'.','.','4','.','.','.','.','.','.'}};

        char[][] arr = {{'8','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
//        for(int i=0; i<9; i++)
//        {
//            for (int j=0; j<9;j++)
//            {
//                System.out.println("Enter the value arr["+i+"]["+j+"]: ");
//                arr[i][j] = scn.next().charAt(0);
//            }
//        }

        System.out.println(isValidSudoku(arr));
    }

    private static boolean isValidSudoku(char[][] board) {

        for(int i=0; i<9;i++)
        {
            HashSet<Character> set = createSet();
            for(int j=0; j<9;j++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else if(set.contains(board[i][j]))
                {
                    set.remove(board[i][j]);
                }
                else
                {
                    return false;
                }
            }
        }

        for(int j=0; j<9;j++)
        {
            HashSet<Character> set = createSet();
            for(int i=0; i<9;i++)
            {
                if(board[i][j]=='.')
                {
                    continue;
                }
                else if(set.contains(board[i][j]))
                {
                    set.remove(board[i][j]);
                }
                else
                {
                    return false;
                }
            }
        }

        for(int l=0; l<=6;l+=3) {
            for (int k = 0; k <= 6; k += 3) {
                HashSet<Character> set = createSet();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i + l][j + k] == '.') {
                            continue;
                        } else if (set.contains(board[i + l][j + k])) {
                            set.remove(board[i + l][j + k]);
                        } else {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }

    private static HashSet<Character> createSet(){
        return new HashSet<>(Arrays.asList('1','2','3','4','5','6','7','8','9'));
    }
}
