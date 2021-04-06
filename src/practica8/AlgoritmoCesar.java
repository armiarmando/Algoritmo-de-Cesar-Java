/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica8;

/**
 *
 * @author stark
 */
public class AlgoritmoCesar {
    private String textoCifrado;
    public String cifrar(String texto,int corrimientos){
        char[] aCaracteres = texto.toCharArray();
        for(int i=0;i<aCaracteres.length;i++){
            aCaracteres[i] = (char) ((char)(aCaracteres[i]+corrimientos)%256);        
        }
        textoCifrado=String.valueOf(aCaracteres);
        return textoCifrado;
    }
   
    public String getTextoCifrado(){
        return textoCifrado;
    }
}
