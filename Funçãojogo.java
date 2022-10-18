/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funçãojogo;

/**
 *
 * @author 20222TPMI0035
 */
public class Funçãojogo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public static char[] criarJogo(String palavra){
        char[]resp=new char[palavra.length()];
        for(int i=0;i<resp.length;i++){
            resp[i]="";
        }
        return resp;
    }
}
