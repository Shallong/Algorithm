package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Input:
 a
 b

 Output:
 a と b を足し算した数を出力してください。

 Condition:
 1 ≦ a ≦ 101
 1 ≦ b ≦ 101
 a, b は正の整数

 */
public class Ando04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0, c = 0;
        String line;
        while ((line = br.readLine()) != null) {
            c++;
            if (c == 1) {
                a = Integer.parseInt(line);
            }
            if (c == 2) {
                b = Integer.parseInt(line);
                break;
            }
        }
        System.out.println(a + b);
    }
}
