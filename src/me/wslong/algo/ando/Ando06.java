package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 n

 Output:
 n から 1 までを順番に 1 ずつ減らしながら出力し、最後に 0!! と出力してください( ! は半角)。

 Conditions:
 1 ≦ n ≦ 100
 n は整数


 */
public class Ando06 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        while (n >= 0) {
            if (n == 0) {
                System.out.println("0!!");
                break;
            }
            System.out.println(n);
            n--;
        }
    }
}
