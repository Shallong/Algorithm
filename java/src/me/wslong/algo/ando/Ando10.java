package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 n

 Outputs:
 1 から n を全て掛けあわせた数を出力して下さい。

 Conditions:
 1 ≦ n ≦ 7
 n は正の整数


 */
public class Ando10 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int r = 1;
        while (n > 0) {
            r *= n;
            n--;
        }
        System.out.println(r);
    }
}
