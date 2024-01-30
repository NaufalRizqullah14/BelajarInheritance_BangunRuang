
package bangun_ruang;

 import java.util.Scanner;

public class Belajar_Inheritance {
     public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Bangun_Ruang bangunRuang = new Bangun_Ruang();
        
        Kubus kubus = new Kubus();
        System.out.println("masukan s kubus :");
        kubus.s = input.nextInt();
        
        Balok balok = new Balok(); 
        System.out.println("masukan panjang balok :");
        balok.p = input.nextInt();
        System.out.println("masukan lebar balok :");
        balok.l = input.nextInt();
        System.out.println("masukan tinggi balok :");
        balok.t = input.nextInt();
        
        Bola bola = new Bola();
        System.out.println("masukan jari-jari bola :");
        bola.r = input.nextInt();
        
        
        LimasSegitiga limasSegitiga = new LimasSegitiga();
        System.out.println("masukan  alas limassegitiga :");
        limasSegitiga.a= input.nextInt();
        System.out.println("masukan ts limas segitiga :");
        limasSegitiga.ts= input.nextInt();
        System.out.println("masukan tl limas segitiga :");
        limasSegitiga.tl=input.nextInt();
        System.out.println("masukan sisi tegak limas segitiga :");
        limasSegitiga.sisitegak=input.nextInt();        
        
       bangunRuang.volume();
       bangunRuang.luas();
       
       kubus.volume();
       kubus.luas();
       
       bola.volume();
       bola.luas();
       
       balok.volume();
       balok.luas();
       
       limasSegitiga.volume();
       limasSegitiga.luas();
       
       
               
    }
    
}


