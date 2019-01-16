package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 n
 m

 Outputs:
 各色の幅 n 、縞模様全体の長さ m の赤を 'R' 、白を 'W' とした赤から始まる縞模様を出力して下さい。


 Conditions:
 1 ≦ n ≦ 10
 1 ≦ m ≦ 20

 n, m は整数

 */
public class Ando17 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int n = 0, m = 0, c = 0;
        while ((line = br.readLine()) != null) {
            if (c == 0) {
                n = Integer.parseInt(line);
            } else {
                m = Integer.parseInt(line);
                break;
            }
            c++;
        }
        int d = m / n;
        int r = m % n;
        String Rn = "";
        String Wn = "";
        String rn = "";
        for (int i = 0; i < n; i++) {
            Rn += "R";
            Wn += "W";
        }
        for (int i = 0; i < r; i++) {
            rn += (d == 0 || d % 2 == 0) ? "R" : "W";
        }
        String out = "";
        for (int i = 0; i < d; i++) {
            if (i == 0 || i % 2 == 0) {
                out += Rn;
            } else {
                out += Wn;
            }
        }
        System.out.println(out + rn);
    }
}
