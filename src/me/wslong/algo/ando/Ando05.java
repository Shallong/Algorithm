package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 p_1
 p_2
 p_3
 p_4
 p_5

 Outputs:
 yes か no の数の多い方を出力して下さい。

 Conditions:
 p_1、p_2、p_3、p_4、p_5 は yes か no の文字列


 */
public class Ando05 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0, yes = 0, no = 0;
        String line;
        String[] p_ = new String[5];
        while ((line = br.readLine()) != null) {
            c++;
            if (c == 1) {
                p_[0] = line;
            } else if (c == 2) {
                p_[1] = line;
            } else if (c == 3) {
                p_[2] = line;
            } else if (c == 4) {
                p_[3] = line;
            } else {
                p_[4] = line;
                break;
            }
        }
        for (int i = 0; i < p_.length; i++) {
            if (p_[i].length() == 3) {
                yes++;
            } else {
                no++;
            }
        }
        System.out.println(yes > no ? "yes" : "no");
    }
}
