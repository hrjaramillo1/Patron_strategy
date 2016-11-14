/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.utpl.arquitectura.patron_strategy;

/**
 *
 * @author Rafael
 */
public class Main {

    public static void main(String[] args) {
        
        OperacionAritmetica context;
        context = new OperacionAritmetica(new Sumar());
        
        int suma = context.procesar(3, 4);
        context = new OperacionAritmetica(new Restar());
        
        int resta = context.procesar(3, 4);
        context = new OperacionAritmetica(new Multiplicar());
        
        int multip = context.procesar(3, 4);
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multip);
    }
}
