/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.tablemodels;

import beans.Alumno;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author alumno_dam
 */
public class AlumnosTableModel extends AbstractTableModel {

    private List<Alumno> listaAlumno;
    private String[] columnas = {"Nombre", "Curso"};

    public AlumnosTableModel(List<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
    
    @Override
    public int getRowCount() {
        return listaAlumno.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                return listaAlumno.get(rowIndex).getNombre();
            case 1:
                return listaAlumno.get(rowIndex).getCurso();
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
    
}
