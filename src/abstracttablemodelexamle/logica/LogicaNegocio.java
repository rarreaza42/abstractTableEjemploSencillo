/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracttablemodelexamle.logica;

import abstracttablemodelexamle.beans.Alumno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno_dam
 */
public class LogicaNegocio {

    public List<Alumno> listaAlumnos;

    public LogicaNegocio() {
        listaAlumnos = new ArrayList<>();
        listaAlumnos.add(new Alumno("Pablo", "DAM2"));
        listaAlumnos.add(new Alumno("Juan", "DAM1"));
        listaAlumnos.add(new Alumno("Pedro", "DAM1"));
    }

    public List<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

}
