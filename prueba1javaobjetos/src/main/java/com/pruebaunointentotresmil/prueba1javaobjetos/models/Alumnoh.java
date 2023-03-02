package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Alumnoh extends Individuop{

    //--------- 1 atributos personales --------------

    public String curso;

    //--------- 2 constructores --------------
    public Alumnoh() {
        super();
    }

    public Alumnoh(String nombre, String apellido1, String apellido2, String rut, String sexo, String direccion,
    Integer edad, String curso) {
    super(nombre, apellido1, apellido2, rut, sexo, direccion, edad);
    this.curso = curso;
}

    //--------- 3 Getters y Setters --------------

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //--------- 4 funcionalidades --------------

    public String conducta (boolean seComporta){
    if (seComporta == true) {
        return "Mantiene una buena conducta";
        
    } else {
        return "Falta mejorar su conducta";
    }
 }
 
    //--------- 5  toString --------------------- 

    @Override
    public String toString() {
        return super.toString() + "Alumnoh [curso=" + curso + "]";
    }

}
