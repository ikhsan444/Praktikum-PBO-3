/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ikhsan
 */

public class angka {
 int angka;
 int Input;
 int kesempatan;

 void Input(){
     angka=(int)(Math.random()*100);
     kesempatan = 5;
    do{
        Scanner n = new Scanner(System.in);
        System.out.println("Masukan Tebakan anda: ");
        this.Input=n.nextInt();
        kesempatan--;
        
   if(Input > angka ){
        System.out.println("Maaf tebakan anda terlalu besar, Silakan coba lagi");
    }
    if(Input < angka ){
        System.out.println("Maaf tebakan anda terlalu kecil, Silakan coba lagi");

    }
    if(Input == angka ){
        System.out.println("SELAMAT TEBAKAN ANDA BENAR");
        System.out.println("Terimaksih Telah Bermain");
    }
    }while(Input != angka);
    }
}

    
