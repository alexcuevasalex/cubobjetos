/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALEX
 */
public class Cubo extends Cuadrado {
    private final int pi_lado;
    private int pi_perimetro;
    private int pi_volumen;

    public Cubo(Integer pi_l) {
        super(pi_l);
        pi_lado = pi_l;
    }
    
/**
 *
 * CLASE Cubo
 * Función: CalcularPerimetro()
 * Descripción: Calcula el perimetro de un Cubo
 */
    private void _calcularPerimetroCub() {
        pi_perimetro = pi_lado * 12;
    }
    private void _calcularVolumenCub() {
        pi_volumen = pi_lado * super._getAreaCua();
    }
    
    public int _getPerimetroCub(){
        _calcularPerimetroCub();
        return pi_perimetro;
    }
    
    public int _getVolumenCub(){
        _calcularVolumenCub();
        return pi_volumen;
    }
    
}
