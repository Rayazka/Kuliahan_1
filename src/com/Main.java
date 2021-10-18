package com;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        String[][] mhs = {
                {"001", "Annisa", "3.45"},
                {"002", "Budi", "3.25"},
                {"003", "Cinta", "3.56"},
                {"004", "Dewi", "3.75"}
        };

        System.out.println("Daftar Mahasiswa");
        System.out.println("NIM\t\tNama\tIPK");

        for (int i = 0; i < mhs.length; i++){
            System.out.println(mhs[i][0] + "\t\t" + mhs[i][1] + "\t" + mhs[i][2]);
        }

        System.out.print("\nMasukkan NIM mahasiswa yang anda cari : ");
        String userInput = scan.nextLine();

        for (int j = 0; j < mhs.length; j++){
            if(userInput.equals(mhs[j][0])){
                System.out.println("NIM\t\t: " + mhs[j][0]);
                System.out.println("Nama\t: " + mhs[j][1]);
                System.out.println("IPK\t\t: " + mhs[j][2]);
            }else{
                System.out.println("Data tidak ditemukan...");
                break;
            }
        }
    }
}
