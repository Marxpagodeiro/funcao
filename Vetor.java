/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor;

import java.util.Scanner;

/**
 *
 * @author 20222TPMI0035
 */
public class Vetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Variaveis
        
        String Da = "Com base nos lados dados pelo usuario:";
        String Tri = "A figura é um triagulo";
        String NTri = "A figura não é um triagulo";
        String Equi = "Do tipo triagulo Equilatero";
        String Iso = "Do tipo triagulo Isósceles";
        String Esca = "Do tipo triagulo Escaleno";
        String Ret= "E é um triangulo Retangulo";
        String NRet = "E não é um triagulo Retangulo";
        String lado = "Digite o valor do lado ";
        double[]lados = new double[3];
        
        int pos=0;
        double total=0;
        double aux= 0;
        
        // Pergunta ao usuario.
        
        for(int i=0;i<lados.length;i++){
            System.out.println(lado + (i+1));
            lados[i] =in.nextDouble();
        }
        // Calculo para descobrir qual é o valor maior.
         
        for(int i=1;i<lados.length;i++){
            if(lados[i]>lados[pos]){
                pos=i;
            }
        }
        
        // Calculo para descobrir a soma dos dois lados menores.
        
        for(int i=0;i<lados.length;i++){
            if(i!=pos){
                total=total+lados[i];
            }
        }
        
        // Variavel auxiliar.
        
        aux=lados[0];
        lados[0]=lados[pos];
        lados[pos]=aux;
        
        // Afirmações para ver se é triangulo; se for triangulo, para ver de qual tipo é, e se ele é retangulo.
        
        System.out.println(Da);
        if(total>lados[pos]){
            System.out.println(Tri);
            if(lados[0]==lados[1] && lados[1]==lados[2]){
                System.out.println(Equi);
            }else if(lados[0]==lados[1] || lados[0]==lados[2] || lados[1]==lados[2]){
                System.out.println(Iso);
            }else{
                System.out.println(Esca);
            }
            if((lados[0]*lados[0])== (lados[1]*lados[1])+(lados[2]*lados[2])){
               System.out.println(Ret); 
            }else{
                System.out.println(NRet); 
 
            }
        }else{
           System.out.println(NTri); 
        } 
    }
    
}
