package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs
 ------
 N
 M1
 x_1 x_2 ... x_M1
 M2
 y_1 y_2 ... y_M2


 Outputs
 -------
 あなたの買うべき巻を小さい順に空白区切りで出力してください。
 ただし、買うべき巻がない場合は None と出力してください。


 Conditions
 ----------
 1 ≦ N ≦ 1000
 1 ≦ M1, M2 ≦ N
 1 ≦ x_i, y_i ≦ N

 */
public class Ando16 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 1, M1 = 0, M2 = 0;
        String line, x_M1 = "", y_M2 = "";
        while ((line = br.readLine()) != null) {
            if (c == 1) {
            } else if (c == 2) {
                M1 = Integer.parseInt(line);
            } else if (c == 3) {
                x_M1 = line;
            } else if (c == 4) {
                M2 = Integer.parseInt(line);
            } else {
                y_M2 = line;
                break;
            }
            c++;
        }
        int[] ms = new int[M2];
        int[] m1 = new int[M1];
        int[] m2 = new int[M2];

        String[] xM1 = x_M1.split(" ");
        for (int i = 0; i < xM1.length; i++) {
            m1[i] = Integer.parseInt(xM1[i]);
        }

        String[] yM2 = y_M2.split(" ");
        for (int i = 0; i < yM2.length; i++) {
            m2[i] = Integer.parseInt(yM2[i]);
        }

        for (int i = 0; i < m2.length; i++) {
            int has = 0;
            for (int j = 0; j < m1.length; j++) {
                if (m1[j] == m2[i]) {
                    has = 1;
                    break;
                }
            }
            if (has == 0) {
                ms[i] = m2[i];
            } else {
                ms[i] = 0;
            }
        }

        int has = 0;
        for (int i = 0; i < ms.length; i++) {
            if (ms[i] != 0) {
                has = 1;
                break;
            }
        }
        if (has == 0) {
            System.out.println("None");
        } else {
            String rs = "";
            for (int i = 0; i < ms.length; i++) {
                for (int j = i + 1; j < ms.length; j++) {
                    int ii = ms[i];
                    int jj = ms[j];
                    if (ii > jj) {
                        ms[i] = jj;
                        ms[j] = ii;
                    }
                }
                if (ms[i] != 0) {
                    rs += (ms[i] + " ");
                }
            }
            System.out.println(rs.trim());
        }
    }
}
