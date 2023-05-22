/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package MainKinetic;

import java.util.Scanner;

/**
 *
 * @author Rafi Ari Fiandi
 * 22104410057
 * Teknik Informatika
 */




class MainKinetic {
    private double massa;
    private double kecepatan;
 
    public void setMassa(double massa) {
        this.massa = massa;
    }
 
    public double getMassa() {
        return massa;
    }
 
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }
 
    public double getKecepatan() {
        return kecepatan;
    }
 
    public double hitungEnergiKinetik() {
        return 0.5 * massa * Math.pow(kecepatan, kecepatan);
    }
}
 
public class MainKinetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        MainKinetic kinetik = new MainKinetic();
 
        System.out.print("Masukkan massa sepeda (kg): ");
        double massa = scanner.nextDouble();
        kinetik.setMassa(massa);
 
        System.out.print("Masukkan kecepatan sepeda (m/s): ");
        double kecepatan = scanner.nextDouble();
        kinetik.setKecepatan(kecepatan);
 
        double energiKinetik = kinetik.hitungEnergiKinetik();
        System.out.println("Energi kinetik sepeda: " + energiKinetik + " Joule");
    }
}

