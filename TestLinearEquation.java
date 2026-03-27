/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
import java.util.Scanner;

public class TestLinearEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // INPUT:
        // Meminta pengguna memasukkan nilai a, b, c, d, e, dan f
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();

        System.out.print("Masukkan nilai d: ");
        double d = input.nextDouble();

        System.out.print("Masukkan nilai e: ");
        double e = input.nextDouble();

        System.out.print("Masukkan nilai f: ");
        double f = input.nextDouble();

        // PROSES:
        // Membuat objek dengan constructor kosong sesuai soal
        LinearEquation persamaan = new LinearEquation();

        // PROSES:
        // Mengisi nilai ke atribut private melalui setter
        persamaan.setA(a);
        persamaan.setB(b);
        persamaan.setC(c);
        persamaan.setD(d);
        persamaan.setE(e);
        persamaan.setF(f);

        // OUTPUT:
        // Menampilkan hasil perhitungan
        if (persamaan.isSolvable()) {
            System.out.println("Persamaan memiliki solusi:");
            System.out.println("Nilai x = " + persamaan.getX());
            System.out.println("Nilai y = " + persamaan.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi");
        }

        input.close();
    }
}