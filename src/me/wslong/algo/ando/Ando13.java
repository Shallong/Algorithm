package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 N

 Outputs:
 N! の最下位桁から続く0 をすべて除いた値の下位9桁を出力して下さい。

 Conditions:
 1 ≦ N ≦ 1000000

 */
public class Ando13 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long t1 = System.currentTimeMillis();
        int r = 0;
        int i = 0;
        int j = 0;
        int k = 0;
        int n = Integer.parseInt(line);
        int a[] = new int[] { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        
        for (i = 1; i <= n; i++) {
            for (j = 0; j < 17; j++) {
                a[j] = a[j] * i;
            }
            for (j = 0; j < 17 - 1; j++) {
                a[j + 1] += a[j] / 10;
                a[j] = a[j] % 10;
            }
            for (j = 0; j < 6; j++) {
                if (a[0] == 0) {
                    for (k = 0; k < 17 - 1; k++) {
                        a[k] = a[k + 1];
                        a[16] = a[15] / 10;
                        a[15] = a[15] % 10;
                    }
                }
            }
        }
        
        for (i = 8; i >= 0; i--) {
            r = r * 10 + a[i];
        }

        long t2 = System.currentTimeMillis();
        System.out.println(r);
        System.out.println((t2 - t1) + " ms");
    }
}
