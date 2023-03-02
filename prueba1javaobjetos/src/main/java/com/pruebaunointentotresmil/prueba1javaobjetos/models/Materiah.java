package com.pruebaunointentotresmil.prueba1javaobjetos.models;

public class Materiah extends Ramop  {

//--------- 1 atributos generales--------------
    public String contenido;

//--------- 2 constructores --------------

    public Materiah() {
        super();
    }

    public Materiah(String nombreAsignatura, Integer nivel, Profesorh nombreProfesorh, String contenido) {
        super(nombreAsignatura, nivel, nombreProfesorh);
        this.contenido = contenido;
    }

//--------- 3 gettes y setters--------------

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

//--------- 4 funcionalidades --------------

public String complejidad (boolean esDificil){
    if (esDificil == true) {
        return "La asignatura es dificil";
        
    } else {
        return "La asignatura no es dificil";
    }
 }

 //--------- 5 toString --------------
@Override
public String toString() {
    return super.toString() + "Materiah [contenido=" + contenido + "]";
}

}
