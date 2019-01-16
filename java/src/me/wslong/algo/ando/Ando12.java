package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*

 Inputs:
 X Y Z N
 d_1 a_1
 d_2 a_2
 ...
 d_N a_N

 d_i a_i

 d_i = 0 のとき、「側面と平行な方向」で左側面からの距離が a_i cm の位置に包丁を入れることを、
 d_i = 1 のとき、「前面と平行な方向」で前面からの距離が a_i cm の位置に包丁を入れることを

 Outputs:
 切り分けられたケーキの中で体積が最も小さいものの体積 (単位は cm^3) を 1 行に出力してください。

 Conditions:
 1 ≦ X, Y, Z, N ≦ 100
 d_i は 0 または 1
 d_i = 0 のとき 1 ≦ a_i ≦ X-1
 d_i = 1 のとき 1 ≦ a_i ≦ Y-1
 同じ場所に 2 回以上包丁を入れることはない
 入力される値はすべて整数

 */
public class Ando12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int X = 0, Y = 0, Z = 0, N = 0, c = 0, xn = 0, yn = 0;
        String[] inputs = null;
        int[] x = null, y = null;
        while ((line = br.readLine()) != null) {
            if (c == 0) {
                String[] arg = line.split(" ");
                X = Integer.parseInt(arg[0]);
                Y = Integer.parseInt(arg[1]);
                Z = Integer.parseInt(arg[2]);
                N = Integer.parseInt(arg[3]);
                inputs = new String[N];
                x = new int[N + 1];
                y = new int[N + 1];
            } else {
                inputs[c - 1] = line;
            }
            c++;
            if (c == N + 1) {
                break;
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            if (inputs[i].charAt(0) == '0') {
                x[xn] = Integer.parseInt(inputs[i].substring(2));
                xn++;
            } else {
                y[yn] = Integer.parseInt(inputs[i].substring(2));
                yn++;
            }
        }
        x[xn] = X;
        y[yn] = Y;
        Arrays.sort(x);
        Arrays.sort(y);
        int[] xx = new int[xn + 1];
        int[] yy = new int[yn + 1];
        xn = 0;
        yn = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] != 0) {
                xx[xn] = x[i] - (i == 0 ? 0 : x[i - 1]);
                xn++;
            }
        }
        for (int i = 0; i < y.length; i++) {
            if (y[i] != 0) {
                yy[yn] = y[i] - (i == 0 ? 0 : y[i - 1]);
                yn++;
            }
        }
        int smallest = xx[0] * yy[0];
        for (int i = 0; i < xx.length; i++) {
            for (int j = 0; j < yy.length; j++) {
                int tmp = xx[i] * yy[j];
                if (smallest > tmp) {
                    smallest = tmp;
                    continue;
                }
            }
        }
        System.out.println(smallest * Z);
    }
}
