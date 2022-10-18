/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package função1;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Função1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1= umDouble("digite o primero numero");
        double num2= umDouble("digite o segundo numero");
        double calculo = media(num1,num2);
        System.out.println("A media é " + calculo);
        
    }
    public static double media(double x,double y){
        double resp = (x+y)/2;
        return resp;
    }
    public static double umDouble(String texto){
        Scanner in = new Scanner(System.in);
        System.out.println(texto);
        double resp = in.nextDouble();
        return resp;
    }
    
}
