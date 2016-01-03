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
    // TODO
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        long t1 = System.currentTimeMillis();
        int N = Integer.parseInt(line);
        int[] n = new int[N];
        for (int i = 1; i <= N; i++) {
            int tmp = i;
            while (tmp % 10 == 0) {
                tmp = tmp / 10;
            }
            n[i - 1] = tmp;
        }
        int[] m = new int[100000];
        m[0] = 1;
        for (int i = 0; i < N; i++) {
            int v = i + 1;
            int tmp = 0;
            for (int j = 0; j < m.length; j++) {
                int mv = m[j] * v + tmp;
                int d = mv / 10;
                int r = mv % 10;
                tmp = d;
                m[j] = r;
            }
        }
        int endCount = 0;
        for (int i = 0; i < 100000; i++) {
            if (m[i] != 0) {
                break;
            }
            endCount++;
        }
        System.out.println(endCount);

        String tmp = "";
        for (int i = 99999; i >= 0; i--) {
            tmp += m[i];
        }

        String r = tmp.substring(100000 - endCount - 9, 100000 - endCount);
        long t2 = System.currentTimeMillis();
        System.out.println(r);
        System.out.println((t2 - t1) + " ms");
    }
}
