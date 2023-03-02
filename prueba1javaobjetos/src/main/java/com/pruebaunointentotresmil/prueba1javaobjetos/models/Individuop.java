package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Individuop {

    //--------- 1 atributos generales--------------

    public String nombre;
    public String apellido1;
    public String apellido2;
    private String rut;
    public String sexo;
    private String direccion;
    public Integer edad;

    //--------- 2 Constructrores---------------------

    public Individuop() {
    }

    public Individuop(String nombre, String apellido1, String apellido2, String rut, String sexo, String direccion,
            Integer edad) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.rut = rut;
        this.sexo = sexo;
        this.direccion = direccion;
        this.edad = edad;
    }

    //--------- 3 Getters y Setters ---------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    //--------- 4  toString ---------------------
    
    @Override
    public String toString() {
        return "Individuop [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", rut=" + rut
                + ", sexo=" + sexo + ", direccion=" + direccion + ", edad=" + edad + "]";
    }
    
    







    

}
