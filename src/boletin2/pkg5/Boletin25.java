/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg5;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float distancia;
        System.out.println("Introduce la distancia en millas");
        Scanner distanciaTeclado = new Scanner(System.in);
        distancia = distanciaTeclado.nextFloat();
        System.out.println("La distancia en metros es :"+distancia*1852);
    }
    
}
