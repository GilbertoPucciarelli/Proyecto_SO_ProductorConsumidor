/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Gilberto
 */
public class C_Postres extends Cocineros{
    
    public C_Postres(){
        super();
        hora = (float) 0.30;
        mesones = 10;
        cantidadInicial = 0;
        ejecutando = false;
    }
    
    @Override
    public void run(){
        
    }
    
}