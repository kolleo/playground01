/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Arrays;

/**
 *
 * @author oko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = "OTTO KAI      EVA TITO   ";
        
        String[] tokens = input.split("\\s+");
        
        System.out.println(Arrays.toString(tokens));
    }
    
}
