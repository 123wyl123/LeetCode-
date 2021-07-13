package Acwing.ThirtySeven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SixtyFour {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.valueOf(bufferedReader.readLine());
        while (T > 0) {
            T--;
            int n = Integer.valueOf(bufferedReader.readLine());
            String c = bufferedReader.readLine();

            StringBuffer a = new StringBuffer();
            StringBuffer b = new StringBuffer();

            int aa = 0;
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                char c1 = c.charAt(i);
                if (c1 - '0' == 0) {
                    a.append(0);
                    b.append(0);
                } else if (c1 - '0' == 2) {
                    if (a.length() == 0) {
                        a.append(1);
                        b.append(1);
                    } else {

                        if (aa == 1) {
                            b.append(2);
                            a.append(0);
                        } else if (aa == 0) {
                            a.append(1);
                            b.append(1);
                            aa = 0;
                        } else {
                            b.append(0);
                            a.append(2);
                        }
                    }
                }
                else{
                        if (a.length() == 0) {
                            a.append(1);
                            b.append(0);
                        } else {


                            if (aa == 1) {
                                b.append(1);
                                a.append(0);
                            } else if (aa == 0) {
                                a.append(0);
                                b.append(1);
                                aa = 2;
                            } else if (aa == 2) {
                                b.append(0);
                                a.append(1);

                            }
                        }
                    }
                }
                System.out.println(a.toString());
                System.out.println(b.toString());
            }
        }
    }

