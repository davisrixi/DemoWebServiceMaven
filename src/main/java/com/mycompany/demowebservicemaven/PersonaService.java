/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demowebservicemaven;

import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Alumnos
 */
@WebService 
public interface PersonaService {

    Persona buscarPersona(long legajo);
    
    List<Persona> obtenerPersonas();

}
