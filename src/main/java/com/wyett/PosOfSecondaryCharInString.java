package com.wyett;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author : wyettLei
 * @date : Created in 2022-04-11 10:56
 * @description: find the secondary charactor in string and print out the pos
 *
 * example:
 * input: abcdefgabcab
 * sout:
 * abcdefgabcab
 * a, 0, 7
 * b, 1, 8
 * c, 2, 9
 *
 */

public class PosOfSecondaryCharInString {

    public static void getPosOfSecondaryCharInString(String s) {
        char[] arrChar = s.toCharArray();
        Set<Character> sc = new HashSet<Character>();

        for (int i=0; i<arrChar.length; i++) {
            for(int j=i+1; j<arrChar.length; j++) {
                if ((arrChar[i] == arrChar[j]) && (!sc.contains((Character) arrChar[i]))) {
                    System.out.println(arrChar[i]+", "+i+", "+j);
                    sc.add((Character)arrChar[i]);
                    break;
                }
            }
        }

        if (sc.isEmpty()) {
            System.out.println(-1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        System.out.println(inputStr);
        getPosOfSecondaryCharInString(inputStr);

    }
}
