/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import meuprimeiroteste.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
        
    }
    
    @Test
    public void deveRetornar4quandoPassar2e2(){
        Integer esperava = 4;
        Calculadora calculadora = new Calculadora();
        Integer resultado = calculadora.soma(2, 2);
        assertEquals(esperava, resultado);
    }
    
     @Test
    public void deveRetornar5quandoPassar3e2(){
        Integer esperava = 5;
        Calculadora calculadora = new Calculadora();
        Integer resultado = calculadora.soma(3, 2);
        assertEquals(esperava, resultado);
    }
    
}
