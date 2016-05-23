package me.wslong.algo.ando;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*

 Inputs:
 N
 q_{0, 0} q_{0, 1} q_{0, 2} ... q_{0, N-1}
 q_{1, 0} q_{1, 1} q_{1, 2} ... q_{1, N-1}
 ...
 q_{N-1, 0} q_{N-1, 1} q_{N-1, 2} ... q_{N-1, N-1}
 M
 p_{0, 0} p_{0, 1} p_{0, 2} ... p_{0, M-1}
 p_{1, 0} p_{1, 1} p_{1, 2} ... p_{1, M-1}
 ...
 p_{M-1, 0} p_{M-1, 1} p_{M-1, 2} ... p_{M-1, M-1}

 Outputs:
 パターンと完全一致する左上のピクセルの座標を半角スペース区切りで出力してください。


 Conditions:
 10 ≦ N ≦ 100, 2 ≦ M ≦ 10
 q_{i, j}, p_{i, j} は 0 または 1
 パターンと完全一致する箇所は必ず1つだけ存在します


 */
public class Ando11 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0, n = 0, m = 0;
        int[][] N = null, M = null;
        String[] Ns = null, Ms = null;
        String line;
        while ((line = br.readLine()) != null) {
            c++;
            if (c == 1) {
                n = Integer.parseInt(line);
                N = new int[n][n];
                Ns = new String[n];
            } else if (c > 1 && c <= 1 + n) {
                Ns[c - 2] = line;
            } else if (c == n + 2) {
                m = Integer.parseInt(line);
                M = new int[m][m];
                Ms = new String[m];
            } else if (c > 2 + n && c <= 2 + m + n) {
                Ms[c - 3 - n] = line;
            }
            if (c == 2 + m + n) {
                break;
            }
        }

        for (int i = 0; i < Ns.length; i++) {
            String[] Nv = Ns[i].split(" ");
            for (int j = 0; j < Nv.length; j++) {
                N[i][j] = Integer.parseInt(Nv[j]);
            }
        }

        for (int i = 0; i < Ms.length; i++) {
            String[] Mv = Ms[i].split(" ");
            for (int j = 0; j < Mv.length; j++) {
                M[i][j] = Integer.parseInt(Mv[j]);
            }
        }

        for (int in = 0; in <= n - m; in++) {
            boolean finish = false;
            for (int jn = 0; jn <= n - m; jn++) {
                boolean match = true;
                for (int im = 0; im < m; im++) {
                    for (int jm = 0; jm < m; jm++) {
                        if (N[in + im][jn + jm] != M[im][jm]) {
                            match = false;
                            break;
                        }
                    }
                    if (!match)
                        break;
                }
                if (match) {
                    finish = true;
                    System.out.println(in + " " + jn);
                    break;
                }
            }
            if (finish)
                break;
        }
    }

}
