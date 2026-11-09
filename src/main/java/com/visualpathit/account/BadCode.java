package com.visualpathit.account;

public class BadCode {
    public boolean check(int a, boolean b) {
        boolean r1 = a == a;
        boolean r2 = a != a;
        boolean r3 = a < a;
        boolean r4 = a >= a;
        boolean r5 = b && b;
        boolean r6 = b || b;
        int r7 = a - a;
        int r8 = a / a;
        int r9 = a % a;
        boolean r10 = a > a;
        boolean r11 = a <= a;
        int r12 = a ^ a;
        return r1 && r2 && r3 && r4 && r5 && r6 && r10 && r11 && (r7 + r8 + r9 + r12 > 0);
    }
}
