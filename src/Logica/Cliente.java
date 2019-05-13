/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiantes
 */
public class Cliente {
    int x,z;
    
    
    
    public void lanzamiento(){
        int y = 0,a = 0,b= 0,c= 0,d= 0,e= 0,f= 0,g= 0,h= 0,l= 0,m= 0,n= 0,ñ= 0;
        for (int i = 1; i <= 1000; i++) {
            Dado j = new Dado();
            Dado k = new Dado();
            j.setX(6);
            k.setX(6);
            z = j.getX()+ k.getX();
            
            if(z == 1){
                y = y + 1;
            }
            if(z == 2){
                a = a + 1;
            }
            if(z == 3){
                b = b + 1;
            }
            if(z == 4){
                c = c + 1;
            }
            if(z == 5){
                d = d + 1;
            }
            if(z == 6){
                e = e + 1;
            }
            if(z == 7){
                f = f + 1;
            }
            if(z == 8){
                g = g + 1;
            }
            if(z == 9){
                h = h + 1;
            }
            if(z == 10){
                l = l + 1;
            }
            if(z == 11){
                m = m + 1;
            }
            if(z == 12){
                n = n + 1;
            }
        }
        System.out.println("frecuencia de 2: "+a+"\n"+
                "frecuencia de 3: "+b+"\n"+
                "frecuencia de 4: "+c+"\n"+
                "frecuencia de 5: "+d+"\n"+
                "frecuencia de 6: "+e+"\n"+
                "frecuencia de 7: "+f+"\n"+
                "frecuencia de 8: "+g+"\n"+
                "frecuencia de 9: "+h+"\n"+
                "frecuencia de 10: "+l+"\n"+
                "frecuencia de 11: "+m+"\n"+
                "frecuencia de 12: "+n+"\n");
        
        
    }
    
}
