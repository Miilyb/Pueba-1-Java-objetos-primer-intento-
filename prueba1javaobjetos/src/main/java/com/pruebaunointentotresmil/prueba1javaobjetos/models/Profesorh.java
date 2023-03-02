package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Profesorh extends Individuop {

    //--------- 1 atributos generales--------------

    public String asignaturaImparte;

    //--------- 2 constructores --------------

    public Profesorh() {
        super();
    }

    public Profesorh(String nombre, String apellido1, String apellido2, String rut, String sexo, String direccion,
            Integer edad, String asignaturaImparte) {
        super(nombre, apellido1, apellido2, rut, sexo, direccion, edad);
        this.asignaturaImparte = asignaturaImparte;
    }

    //--------- 3 gettersy setters --------------

    public String getAsignaturaImparte() {
        return asignaturaImparte;
    }

    public void setAsignaturaImparte(String asignaturaImparte) {
        this.asignaturaImparte = asignaturaImparte;
    }

    //--------- 4 funcionalidades --------------

    public String didactico (boolean explicaEntretenido){
        if (explicaEntretenido == true) {
            return "Es un profesor muy didactico para explicar";
            
        } else {
            return "Sus clases se tornan aburridas por la monotonia";
        }
     }

     //--------- 5 toString --------------

    @Override
    public String toString() {
        return super.toString()+  "Profesorh [asignaturaImparte=" + asignaturaImparte + "]";
    }
    
}
