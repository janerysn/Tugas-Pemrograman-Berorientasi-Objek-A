package OperasiPerhitungan_Matriks;
class Pecahan {
private int numerator;
private int denominator;

public Pecahan(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        }

public Pecahan add(Pecahan other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Pecahan(newNumerator, newDenominator);
        }

public Pecahan subtract(Pecahan other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Pecahan(newNumerator, newDenominator);
        }

public Pecahan multiply(Pecahan other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Pecahan(newNumerator, newDenominator);
        }

public Pecahan divide(Pecahan other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Pecahan(newNumerator, newDenominator);
        }

public void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
        }

private int gcd(int a, int b) {
        while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
        }
        return a;
        }

@Override
public String toString() {
        return numerator + "/" + denominator;
        }

public static void main(String[] args) {
        int numerator1 = 3;
        int denominator1 = 4;
        int numerator2 = 1;
        int denominator2 = 2;

        Pecahan pecahan1 = new Pecahan(numerator1, denominator1);
        Pecahan pecahan2 = new Pecahan(numerator2, denominator2);

        Pecahan result = pecahan1.add(pecahan2);
        System.out.println("Penjumlahan: " + result);

        result = pecahan1.subtract(pecahan2);
        System.out.println("Pengurangan: " + result);

        result = pecahan1.multiply(pecahan2);
        System.out.println("Perkalian: " + result);

        result = pecahan1.divide(pecahan2);
        System.out.println("Pembagian: " + result);
        }
        }
