package lession1;

import java.util.Scanner;

public class WeekOne {
    public static void ex1() {
        System.out.println("Hello word");
    }

    public static void ex2(Scanner scanner) {
        String name = nhapString(scanner, "Ten cua ban la gi: ");
        if (name.equals("Alice") || name.equals("Bob")) {
            System.out.println("Xin chao " + name);
        } else {
            System.out.println("Ban khong duoc chao don");
        }

    }

    public static void ex4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int s = 0;
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                s = s + i;
            }
        }
        System.out.println("Tổng 1 + 2 + ... + n là: " + s);
    }

    public static void ex6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so A: ");
        int A = scanner.nextInt();
        int B = 0;
        int count = 0;
        while (A != B) {
            if (A > B) {
                System.out.println("Gia tri cua ban lon hon B");
            }
            if (A < B) {
                System.out.println("Gia tri cua ban nho hơn B");
            }
            System.out.println("Nhap gia tri B: ");
            B = scanner.nextInt();
            ++count;
        }
        System.out.println("Gia tri la: " + B + "So lan thu: " + count);
    }

    public static void ex7(Scanner scanner){
        String input = null;
        StringBuilder sb = new StringBuilder(input);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); i++){
            for (int j = i + 1; j < sb.length(); j++){
//                if ()
            }
        }
    }

    public static void ex8() {
        Scanner scanner = new Scanner(System.in);
        int soLan = 0;
        String s1 = nhapString(scanner, "Nhap chuoi: ");
        System.out.println("Chuoi cua ban co: " + s1.length());

        char mangKiTu[] = s1.toCharArray();
        for (int i = 0; i < mangKiTu.length; i++){
            if ('A' == mangKiTu[i]){
                soLan++;
            }
        }
        System.out.println("A" + soLan);
    }

    public static void ex10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        float a = sc.nextFloat();
        System.out.println("Nhap so b: ");
        float b = sc.nextFloat();
        System.out.println("Nhap so c: ");
        float c = sc.nextFloat();
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: " + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

    public static String nhapString(Scanner scanner, String title) {
        System.out.println(title);
        String result = " ";
        try {
            result = scanner.nextLine();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Nhap lai: ");
            return nhapString(scanner, title);
        }
        return result;
    }
}
