/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triângulos;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class Triângulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite o primeiro lado do triângulo:");
        double A = entrada.nextDouble();
        
        System.out.println ("Digite o segundo lado do triângulo:");
        double B = entrada.nextDouble();
        
        System.out.println ("Digite o último lado do triãngulo:");
        double C = entrada.nextDouble();
        
        if((A+B>C) && (A+C>B) && (B+C>A))
            System.out.println("Triângulo");
        if((A==B) && (A==C) && (B==C))
            System.out.println("Equilátero");
        else if((A!=B) && (A!=C) && (B!=C))
            System.out.println("Escaleno");
        else if((A == B) && (A != C) || ((A == C) && (A != B) || ((B == C) && (B != A))))
            System.out.println("isóceles");
        // TODO code application logic here
    }
    
}
