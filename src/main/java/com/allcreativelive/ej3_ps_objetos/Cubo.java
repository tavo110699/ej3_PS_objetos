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
public class Cubo extends Cuadrado{
	public float calcularVolumen() {
		return getLado()*getLado()*getLado();
	}
	@Override
	public float calcularPerimetro() {
		return 12*getLado();
	}
}
