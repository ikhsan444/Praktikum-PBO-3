/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ikhsan
 */

public class angka {
 int angka;
 int Input;
 int point ;
 int kesempatan;
 int bonus;

 void Input(){
     angka=(int)(Math.random()*100);
     kesempatan = 5;
     point = 100;
     bonus = 50;
    do{
        Scanner n = new Scanner(System.in);
        System.out.println("Masukan Tebakan anda: ");
        this.Input=n.nextInt();
        kesempatan--;
        
    if(Input > angka ){
        point=point-2;
        System.out.println("Maaf tebakan anda terlalu besar, Silakan coba lagi");
    }
    if(Input < angka ){
        point=point-2;
        System.out.println("Maaf tebakan anda terlalu kecil, Silakan coba lagi");
    }
    if(Input == angka ){
        System.out.println("SELAMAT TEBAKAN ANDA BENAR");
        System.out.println("Score : "+point);
        if(Input == angka && kesempatan >= 0){
            point = point+ bonus;
        System.out.println("Bonus : 50");
        System.out.println("Score : "+point);
        System.out.println("Terimaksih Telah Bermain");
        {break;}
        
        }
    }
    }
while(Input != angka);
    }
}

    
