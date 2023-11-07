/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
import java.util.Scanner;
public class luasprisma {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang alas segitiga: ");
        double panjangAlasSegitiga = input.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga: ");
        double tinggiSegitiga = input.nextDouble();
        
        System.out.print("Masukkan tinggi prisma: ");
        double tinggiPrisma = input.nextDouble();
        
        System.out.print("Masukkan panjang sisi prisma: ");
        double panjangSisiPrisma = input.nextDouble();
        
        // Hitung luas segitiga
        double luasSegitiga = 0.5 * panjangAlasSegitiga * tinggiSegitiga;
        
        // Hitung luas permukaan tegak prisma
        double luasPermukaanTegakPrisma = 2 * panjangSisiPrisma * tinggiPrisma;
        
        // Hitung luas permukaan prisma segitiga
        double luasPermukaanPrismaSegitiga = 2 * luasSegitiga + luasPermukaanTegakPrisma;
        
        System.out.println("Luas permukaan prisma segitiga adalah: " + luasPermukaanPrismaSegitiga);
    }
}

