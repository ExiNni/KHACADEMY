package com.kh.practice.exam;

import java.util.Scanner;

public class Practice_Hard20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("���� �Է�: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            System.out.println();
        }
    }
}

