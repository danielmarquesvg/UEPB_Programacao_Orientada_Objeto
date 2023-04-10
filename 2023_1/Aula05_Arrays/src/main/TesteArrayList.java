package main;

import java.util.ArrayList;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//instanciando arraylist
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		
		//inicializando
		listaDeNumeros.add(30);
		listaDeNumeros.add(40);
		listaDeNumeros.add(50);
		listaDeNumeros.add(60);
		listaDeNumeros.add(1,100);
		listaDeNumeros.add(0,99);
		listaDeNumeros.add(0,1);
		listaDeNumeros.add(0,2);
		
		listaDeNumeros.set(6,2000);
		
		listaDeNumeros.remove(4);
		
		for(int i = 0; i < listaDeNumeros.size(); i++) {
			System.out.println("Lista["+i+"] = "+listaDeNumeros.get(i));
		}
		
	}
	
}
