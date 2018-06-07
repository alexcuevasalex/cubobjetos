/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEX
 */
public class Cuadrado {
    private final int pi_lado;
    private int pi_perimetro;
    private int pi_area;
    
    public Cuadrado(Integer pi_l) {
        pi_lado = pi_l;
    }
    
/**
 *
 * CLASE Cuadrado
 * Función: CalcularPerimetro()
 * Descripción: Calcula el perimetro de un cuadrado
 */
    private void _calcularPerimetroCua() {
        pi_perimetro = pi_lado * 4;
    }
    
    private void _calcularAreaCua() {
        pi_area = pi_lado * pi_lado;
    }
    
    public int _getPerimetroCua(){
        _calcularPerimetroCua();
        return pi_perimetro;
    }
    
    public int _getAreaCua(){
        _calcularAreaCua();
        return pi_area;
    }
}
