/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aisyah
 */
public class LinearEquation {
    // PROSES:
    // Atribut dibuat private agar tidak bisa diakses langsung dari luar class
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Constructor tanpa argumen (sesuai soal)
    public LinearEquation() {
    }

    // Getter methods (sesuai soal)
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // Setter methods
    // Ditambahkan agar data input dari class pengujian dapat dimasukkan ke objek
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setD(double d) {
        this.d = d;
    }

    public void setE(double e) {
        this.e = e;
    }

    public void setF(double f) {
        this.f = f;
    }

    // PROSES:
    // Mengecek apakah persamaan memiliki solusi
    // Jika ad - bc != 0, maka persamaan solvable
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // PROSES:
    // Menghitung nilai x
    // Rumus: x = (ed - bf) / (ad - bc)
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // PROSES:
    // Menghitung nilai y
    // Rumus: y = (af - ec) / (ad - bc)
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}