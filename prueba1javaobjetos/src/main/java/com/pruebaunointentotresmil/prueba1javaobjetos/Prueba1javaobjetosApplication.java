/*Prueba 1 Java objetos */
/*● El colegio cuenta con distintos cursos, profesores, materias y alumnos
● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
luego permita obtener el promedio de cada estudiante.
● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
alumnos por curso y que luego los muestre.
● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
nota y el promedio de notas. */

//Como yo lo entiendo 

/* 1-Usar herencia por tanto debo de crear las carpetas correpondientes

 * 2-min 3 Funciones diferentes : una puede ser la suma de las notas
 *                                otra debe ser el promedio de las notas
 *                                otra debe ser el arreglo de notas de los alumnos
 * 						          otra debe ser mejor nota, peor nota y promedio
 * 
 * 3- como clase padre puedo tener alumno: con sus atributos generales -nombre-edad-sexo-curso-direccion
 										   como atributo personal- apellido1 - apellido2 -rut
       otra clase padre puede ser Materia: con sus atributos generales - nombre-nivel-profesor que la imparte
                                           con su atributoparticular - contenido de la materia 
      otra clase padre puede ser profesor : con su atributos generales - nombre-edad-sexo-direccion-materia que imparte
	                                        con sus atributos personales -appelido1-apellido2-rut
      o bien tome como clase padre al colegio : con atributos generales -nobmre, profesores,direccion,alumnos (pero no se no me tinca)
	  											como atributo particular cadacual de los definidos anteriormente
     - Creo que se puede hacer una subherencia entre asignatura y profe pero cuco o bien profe alumno con un padre comun
	-Duda a probar en las funcionalidades en este caso de alumno podre meter las otras funciones o.o?
    - como hacer el enrroque entre los objetos y las funciones guardando notas ?
	- en mismo modelsobjetosguardar el array intentar
 * 4- debo de importar varias cositas: scanner, array, objetos y hashmap 
 * 5- hacer un mi
 */
package com.pruebaunointentotresmil.prueba1javaobjetos;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;

//importacion de objetos
import com.pruebaunointentotresmil.prueba1javaobjetos.models.Alumnoh;
import com.pruebaunointentotresmil.prueba1javaobjetos.models.Materiah;
import com.pruebaunointentotresmil.prueba1javaobjetos.models.Nota;
import com.pruebaunointentotresmil.prueba1javaobjetos.models.Profesorh;

//importacion de "herramientas"
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

@SpringBootApplication
public class Prueba1javaobjetosApplication {
//1- funcion promedio
	public static Double promedioNotas(ArrayList <Nota> notasAlumnos){
		Double suma = 0.0;
		for (double i = 0.0; i < notasAlumnos.size(); i++) {
			
			//suma = suma + notasAlumnos.get(i);
		}
		return suma/notasAlumnos.size();
	}

//2-funcion mostrar la menor y mayor nota 
	public static void mostrararreglonota (ArrayList <Nota> notasAlumnos){

        System.out.println(notasAlumnos);

	}






	public static void main(String[] args) {
		//inicializamos Scanner de inmdiato porque lo usare bastante
		Scanner teclado = new Scanner(System.in);

		//------------Creo los objetos----------------------------------------
		Alumnoh alumnoVacio = new Alumnoh();
		Alumnoh alumnoConTodo = new Alumnoh(null, null, null, null, null, null, null, null);

		Materiah ramoVacio = new Materiah();
		Materiah ramoConTodo = new Materiah(null, null, null, null);

		Profesorh profeVacio = new Profesorh();
		Profesorh profeConTodo = new Profesorh(null, null, null, null, null, null, null, null);

		//----------------hashmap para guardar datos alumno y notas------
		HashMap <ArrayList<Alumnoh>, ArrayList<Nota>> alumnoyNota = new HashMap< ArrayList<Alumnoh>, ArrayList<Nota>>();


		//-----------------Ingresar datos del alumno -------------------------------
		// Donde guardaremos la informacion de los objetos
		// creo las variables que usare 
		int cantEstudiantes;
		int cantNotas;
		ArrayList<Alumnoh> infoAlumnos = new ArrayList<Alumnoh>();

		do{
			System.out.print("¿Cuantos estudiantes quiere registrar?: ");
			cantEstudiantes = teclado.nextInt();
	  
		   if(cantEstudiantes <= 0){
			 System.out.print("Por favor ingrese un valor mayor a cero: ");

		 }

		}while(cantEstudiantes <= 0);

		for(int i = 1; i <= cantEstudiantes; i++){
			teclado.nextLine();
			
			System.out.println("Ingrese los datos solicitados ");
  
			System.out.println("Nombre del/la Alumno/a: " + i + " ");
			alumnoConTodo.setNombre(teclado.nextLine());

			System.out.println("Primer apellido del/la Alumno/a: " + i + " ");
			alumnoConTodo.setApellido1(teclado.nextLine());

			System.out.println("Segundo apellido del/la Alumno/a: " + i + " ");
			alumnoConTodo.setApellido2(teclado.nextLine());
	
			System.out.println("RUT del/la Alumno/a: " + i + " ");
			alumnoConTodo.setRut(teclado.nextLine());

			System.out.println("Sexo del/la Alumno/a: " + i + " ");
			alumnoConTodo.setSexo(teclado.nextLine());

			System.out.println("¿En que comuna vive el/la Alumno/a?: " + i + " ");
			alumnoConTodo.setDireccion(teclado.nextLine());
			
			System.out.println("Edad del/la Alumno/a: " + i + " ");
			alumnoConTodo.setEdad(teclado.nextInt());

			System.out.println("¿En que curso esta el/la Alumno/a? (con palabras): " + i + " ");
			alumnoConTodo.setDireccion(teclado.nextLine());
			
			infoAlumnos.add(alumnoConTodo);
			}
         System.out.println(infoAlumnos);
		

		 //----------cantidad de notas por alumno---------------
		 
		 do{
			System.out.print("Indique la cantidad de notas por alumnos: ");
			cantNotas = teclado.nextInt();
			if(cantNotas <= 0){
				System.out.print("La cantidad de notas debe ser mayor a cero");
			}

		}while(cantNotas <= 0);

		 for(int i = 1; i <= cantEstudiantes; i++){
			teclado.nextLine();
			
			Nota notas = new Nota(null);
			
			ArrayList <Nota> notasAlumnos = new ArrayList<Nota>();
			
			for(int x = 1; x <= cantNotas; x++){
				System.out.print("Ingresa nota " +x+ " del alumno: ");
				Double nota = teclado.nextDouble();
				notasAlumnos.add(notas);
			}
			System.out.println(notasAlumnos);
			
			alumnoyNota.put(infoAlumnos, notasAlumnos);

			System.out.println(alumnoyNota);
	}

//-----------------------------------------------------------------------------------------------------------
/*creo que me estoy entrampando sola 
y solo necesito la informacion del alumno la verdad con sus notas*/
//int cantProfesores;
//int cantAsignaturas;

/* 1- Guardado y pedida por teclado de la informacion de Asignatura */

	/*  do{
	  System.out.print("¿Cuantas asignaturas quiere registrar?: ");
	  cantAsignaturas = teclado.nextInt();

	 if(cantAsignaturas <= 0){
	   System.out.print("Por favor ingrese un valor mayor a cero: ");
   }

	 }while(cantAsignaturas <= 0);

	 ArrayList<Asignatura> todasLasAsignaturas = new ArrayList<Asignatura>();

	 for(int i = 1; i <= cantAsignaturas; i++){
		

		System.out.println("Ingrese los datos solicitados ");

		System.out.println("Ingresa El nombre de la asigntura: " + i + " ");
		asignaturaVacia.setNombreAsignatura(teclado.nextLine());

		System.out.println("Ingresa el nivel del curso al cual va dirigido: " + i + " ");
		asignaturaVacia.setNivel(teclado.nextInt());

		System.out.println("Ingresa el nombre del profesor que la imparte: " + i + " ");
		asignaturaVacia.setNombreProfesor(teclado.nextLine());

		System.out.println("Ingresa El contenido de la asigntura: " + i + " ");
		asignaturaVacia.setContenido(teclado.nextLine());
        
	    todasLasAsignaturas.add(asignaturaVacia);
		}
        System.out.println(todasLasAsignaturas);

     	/* 2- Guardado y pedida por teclado de la informacion de los profesores */

	 /*do{
	  System.out.print("¿Cuantos profesores quiere registrar?: ");
	  cantProfesores = teclado.nextInt();

	 if(cantProfesores <= 0){
	   System.out.print("Por favor ingrese un valor mayor a cero: ");
   }

	 }while(cantProfesores <= 0);

	 ArrayList<Profesorh> todosLosProfes = new ArrayList<Profesorh>();

	 for(int i = 1; i <= cantProfesores; i++){
		

		System.out.print("Ingrese los datos solicitados ");

		System.out.print("Ingresa la edad del profesor: " + i + " ");
		profeVacio.setEdad(teclado.nextInt());

		System.out.print("Ingresa el sexo: " + i + " ");
		profeVacio.setSexo(teclado.nextLine());

		System.out.print("Ingresa la materia que imparte: " + i + " ");
		profeVacio.setMateriaImpartida(teclado.nextLine());

		System.out.print("¿Donde vive el profesor?: " + i + " ");
		profeVacio.setDireccion(teclado.nextLine());

		System.out.print("Nombre del profesor: " + i + " ");
		profeVacio.setNombre(teclado.nextLine());

		System.out.print("Primer apellido del profesor: " + i + " ");
		profeVacio.setPrimerApellido(teclado.nextLine());

		System.out.print("segundo apellido del profesor: " + i + " ");
		profeVacio.setSegundoApellido(teclado.nextLine());

		System.out.print("Ingresa El rut del profesor: " + i + " ");
		profeVacio.setRut(teclado.nextInt());
        
	    todosLosProfes.add(profeVacio);
		}
		System.out.println(todosLosProfes);

		// Relacionamos profes con asiganturas
		HashMap <ArrayList<Profesorh>, ArrayList<Asignatura>> asignaturaConProfe = new HashMap<ArrayList<Profesorh>, ArrayList<Asignatura>>();

		asignaturaConProfe.put(todosLosProfes , todasLasAsignaturas); 

     //--------------------------------------------------------------------------------------------------*/
	 
	// -----cuando recien esten operativas las funciones de arriba lo hago-----
	/*int opcion = 1; 

		while(opcion != 0){

			do{
				System.out.println("**************Comienzo de Menú***************");
				System.out.println("Bienvenido/a");
				System.out.println("Seleccione 1 si quiere obtener el promedio");
				System.out.println("Seleccione 2 si quiere ver la mejor y peor nota");
				System.out.println("Seleccione 3 si quiere ver el arreglo de todas las notas");
				System.out.println("Seleccione 0 para cerar el menu");
				System.out.print("Seleccione su opción: ");
				opcion = teclado.nextInt();
				
			}while(opcion < 0 || opcion > 3);

			if(opcion == 1){
				
			}else if (opcion == 2){
				 
			}else if(opcion == 3){
				
			}else{
				System.out.println("FIN");
			}

		}*/

}
}

