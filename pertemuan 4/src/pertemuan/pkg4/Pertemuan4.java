/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan.pkg4;

import java.util.Scanner;

/**
 *
 * @author Radhika Prema Nanda
 * Tanggal : 12 April 2025
 * 
 */
public class Pertemuan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nama = new String[5];
        
        nama[0] = "Yinari Dewi";
        nama[1] = "Santika";
        nama[2] = "Yura";
        nama[3] = "Agustina";
        nama[4] = "Shendy";
        
        Scanner inp = new Scanner(System.in);
        
        for(int idx=0; idx<5; idx++) {
            System.out.println("Data Teman ke-"+String.valueOf(idx)+": "+nama[idx]);
//            nama[idx] = inp.nextLine();
        }
        
//        String NamaTeman = nama[4];
//        System.out.printf("Data teman: %s ", NamaTeman);
//        
        
    }
    
}
