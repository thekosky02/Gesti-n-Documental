/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Familia
 */
public class Estudiante extends Entidad{
    
    private Carrera carrera;
    private String semestre;

    public Estudiante() {
    }

    public Estudiante(Carrera carrera, String semestre, int id, String documento, String nombres, String apellidos, String Correo, String telefono) {
        super(id, documento, nombres, apellidos, Correo, telefono);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    /**
     * @return the carrera
     */
    public Carrera getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the semestre
     */
    public String getSemestre() {
        return semestre;
    }

    /**
     * @param semestre the semestre to set
     */
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
}
