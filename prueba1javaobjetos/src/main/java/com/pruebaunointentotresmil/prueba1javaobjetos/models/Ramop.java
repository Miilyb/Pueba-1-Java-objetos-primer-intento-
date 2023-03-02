package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Ramop {

    //--------- 1 atributos generales--------------
    public String nombreAsignatura;
    public Integer nivel;
    public Profesorh nombreProfesorh;

    //--------- 2 constructores --------------

    public Ramop() {
    }

    public Ramop(String nombreAsignatura, Integer nivel, Profesorh nombreProfesorh) {
        this.nombreAsignatura = nombreAsignatura;
        this.nivel = nivel;
        this.nombreProfesorh = nombreProfesorh;
    }

    //--------- 3 getters y setters -------------- 

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Profesorh getNombreProfesorh() {
        return nombreProfesorh;
    }

    public void setNombreProfesorh(Profesorh nombreProfesorh) {
        this.nombreProfesorh = nombreProfesorh;
    }

    //--------- 4 toString --------------
    @Override
    public String toString() {
        return "Ramop [nombreAsignatura=" + nombreAsignatura + ", nivel=" + nivel + ", nombreProfesorh="
                + nombreProfesorh + "]";
    }
    
}
