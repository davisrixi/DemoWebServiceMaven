/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demowebservicemaven;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author Alumnos
 */

@WebService(endpointInterface = "com.mycompany.demowebservicemaven.PersonaService")
public class PersonaServiceImpl implements PersonaService {

    @Override
    public Persona buscarPersona(long legajo) {
        Persona persona = new Persona();
        persona.setLegajo(legajo);
        persona.setNombre("Mock de persona para el legajo " + legajo);
        return persona;
    }

    @Override
    public List<Persona> obtenerPersonas() {
        List<Persona> lista = new ArrayList<Persona>();
        Persona persona1 = new Persona();
        persona1.setLegajo(0L);
        persona1.setNombre("Mock de persona para el legajo " + 0L);
        Persona persona2 = new Persona();
        persona2.setLegajo(1L);
        persona2.setNombre("Mock de persona para el legajo " + 1L);
        lista.add(persona2);
        Persona persona3 = new Persona();
        persona3.setLegajo(2L);
        persona3.setNombre("Mock de persona para el legajo " + 2L);
        lista.add(persona3);
        return lista;
    }

}
