/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.allcreativelive.ej3_ps_objetos;

/**
 *
 * @author gustavo
 */
public class Cuadrado {
    	private float lado;
        
	public float getLado() {
		return lado;
	}
	public void setLado(float lado) {
		this.lado = lado;
	}
	public float calcularArea() {
		return lado*lado;
	}
	public float calcularPerimetro() {
		return 4*lado;
	}
}
