/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import interfaz.Interfaz;
        
/**
 *
 * @author Gilberto
 */
public class C_Platos_Fuertes extends Cocineros{
    
    public C_Platos_Fuertes(Interfaz interfaz){
        super();
        hora = (float) 0.33;
        mesones = 30;
        cantidadInicial = 2;
        ejecutando = false;
        this.interfaz = interfaz;        
    }

    public float getHora() {
        return hora;
    }

    public void setHora(float hora) {
        this.hora = hora;
    }

    public int getMesones() {
        return mesones;
    }

    public void setMesones(int mesones) {
        this.mesones = mesones;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public void setEjecutando(boolean ejecutando) {
        this.ejecutando = ejecutando;
    }

    public Interfaz getInterfaz() {
        return interfaz;
    }

    public void setInterfaz(Interfaz interfaz) {
        this.interfaz = interfaz;
    }
    
    @Override
    public void run(){
        
    }
    
}
