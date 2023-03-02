package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Nota {

     //--------- 1 atributos personales --------------
    public Double nota;

     //--------- 2 constructores --------------
    public Nota() {
    }
    
    public Nota(Double nota) {
        this.nota = nota;
    }
    //---------3 getters and setters  --------------
    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    //---------4 toString  --------------
    @Override
    public String toString() {
        return "Nota [nota=" + nota + "]";
    }






    
}
