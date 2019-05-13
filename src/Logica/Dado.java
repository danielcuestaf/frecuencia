/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Dado {
    
    int x;
    Random numero = new Random();
    

    public void setX(int x) {
        this.x = numero.nextInt(x)+1;
    }

    public int getX() {
        return x;
    }
    
    
}
