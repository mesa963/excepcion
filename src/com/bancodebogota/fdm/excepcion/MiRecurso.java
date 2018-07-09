/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.excepcion;

/**
 *
 * @author Jamm
 */
public class MiRecurso implements AutoCloseable {
    
    @Override
    public void close() throws Exception
    {
        System.out.println("Cerrando el recurso");
        throw new UnsupportedOperationException("");
    }
    
}
