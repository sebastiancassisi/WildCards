package wildcards;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		App aw = new App();
		
		Persona al1 = new Profesor("Pepe");
		Persona al2 = new Alumno("Juan");
		Profesor al3 = new Profesor("Ramon");
		Alumno al4 = new Alumno("Lalo");
		
		List<Persona> lista = new ArrayList<>(); 
		lista.add(al1);
		lista.add(al2);
		lista.add(al3);
		lista.add(al4);

		aw.listarLowerBounded(lista);
		aw.listarUnBounded(lista);
		aw.listarUpperBounded(lista);
		}
		
//Recibe cualquier tipo que sea subclase  de la clase que estamos indicando
	public void listarUpperBounded (List<? extends Persona> lista){
		
		for (Persona per : lista) {
			System.out.println(per.getNombre());	
		}
	}
	//Recibe cualquier tipo de la super clase que estamos indicando
	public void listarLowerBounded (List<? super Alumno> lista){
		
		for (Object al : lista) {
			System.out.println(((Alumno)al).getNombre());	
		}
	}
	//No se espesifica tipo
	public void listarUnBounded (List<?> lista){
		
		for (Object al : lista) {
			System.out.println(((Alumno)al).getNombre());	
		}
	}
	
	}


