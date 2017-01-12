/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaperimetrotriangolo;
import java.util.Scanner;
/**
 *
 * @author SOKOL CUKA
 */
public class AreaPerimetroTriangolo {

    /**
             * @param args the command line arguments
             */

    public static void main(String[] args) {
         int lato1, lato2, lato3,base, altezza,perimetro ;
     float area;
        Scanner input=new Scanner(System.in);
        do{
            System.out.println(">lunghezza lato 1:");
        
        lato1=input.nextInt();
        }while(lato1<=0);
        do{
        System.out.println(">lunghezza lato 2:");
        lato2=input.nextInt();
        }while(lato2<=0);
        do{
        System.out.println(">lunghezza base:");
        base=input.nextInt();
        }while(base<=0);
        do{
        System.out.println(">lunghezza altezza:");
        altezza=input.nextInt();
        }while(altezza<=0);
        perimetro=lato1+lato2+base;
        area=(base*altezza)/2;
        System.out.println("perimetro= " + perimetro);
        System.out.println("area= " + area);
    }

}
