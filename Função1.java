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
        int[]vet = {5,10,9,6,90,3};
        int num = vet[posMaior(vet)];
        
    }
    public static int posMaior(int[] vet){
        int pos = 0;
        for(int i=1;i<vet.length;i++){
            if(vet[i]>vet[pos]){
                pos=i;
            }
        }
        return pos;
    }
}
