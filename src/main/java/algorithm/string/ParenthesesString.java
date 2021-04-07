package algorithm.string;

import java.util.ArrayList;
import java.util.List;

public class ParenthesesString {
//    public List<String> generateParenthesis(int n) {
//        List<String> output = List.of("()");
//        while (n != 0) {
//            output = addParenthesis(output);
//            n--;
//        }
//
//        return output;
//    }
//
//    private List<String> addParenthesis(List<String> output) {
//
//        return output;
//    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max){
        if (str.length() == max*2) {
            list.add(str);
            return;
        }

        if (open < max) {
            backtrack(list, String.format("%s(", str), open + 1, close, max);
        }

        if (close < max) {
            backtrack(list, String.format("%s)", str), open, close + 1, max);
        }



//        if(str.length() == max*2){
//            list.add(str);
//            return;
//        }
//
//        if(open < max) {
//            backtrack(list, str+"(", open+1, close, max);
//        }
//
//        if(close < open) {
//            backtrack(list, str+")", open, close+1, max);
//        }
    }
}
