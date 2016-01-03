package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 c_1 p_1
 c_2 p_2

 c_1, p_1 はそれぞれドリンク 1 のカフェイン量、値段をあらわします。
 c_2, p_2 はそれぞれドリンク 2 のカフェイン量、値段をあらわします。

 Outputs:
 2 つのエナジードリンクのうちコストパフォーマンスの高いほうの番号を出力してください。


 Conditions:
 1 ≦ c_1, c_2 ≦ 1000
 1 ≦ p_1, p_2 ≦ 1000
 入力される値は全て整数


 */
public class Ando07 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int c = 0;
        String[] c_p = new String[2];
        while ((line = br.readLine()) != null) {
            c_p[c] = line;
            if (c == 1) {
                break;
            }
            c++;
        }
        float[] cp = new float[4];
        for (int i = 0; i < c_p.length; i++) {
            String[] ccp = c_p[i].split(" ");
            cp[i * 2] = Float.parseFloat(ccp[0]);
            cp[i * 2 + 1] = Float.parseFloat(ccp[1]);
        }
        float f1 = cp[0] / cp[1];
        float f2 = cp[2] / cp[3];
        System.out.println(f1 > f2 ? "1" : "2");
    }
}
