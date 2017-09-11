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
public class CalculadoraTest2 {
    
    public CalculadoraTest2() {
        
    }
    @Test
    public void deveriaRetornar8para5e3(){
        Integer esperado=8;
        Integer retornado;
        Calculadora calculadora = new Calculadora();
        retornado = calculadora.soma(5, 3);
        assertEquals(esperado,retornado);
        
    }
    
}
