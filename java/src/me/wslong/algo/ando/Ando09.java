package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Input:
 3
 paiza
 online
 hackathon

 Output:
 paiza_online_hackathon

 Given Conditions:
 2 ≦ n ≦ 10
 n は整数
 1 ≦ 文字列 s の長さ ≦ 10
 s は半角アルファベットで構成された文字列

 */
public class Ando09 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line, result = "";
        int count = 0, n, limit = -1;
        String[] inputs = null;
        while ((line = br.readLine()) != null) {
            count++;
            if (count == 1) {
                n = Integer.parseInt(line);
                limit = n + 1;
                inputs = new String[n];
                continue;
            }
            inputs[count - 2] = line;
            if (count == limit) {
                break;
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            if (i == inputs.length - 1) {
                result += inputs[i];
            } else {
                result += inputs[i] + "_";
            }
        }
        System.out.println(result);
    }
}
