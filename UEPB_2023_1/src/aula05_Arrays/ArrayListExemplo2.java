package aula05_Arrays;

import java.util.ArrayList;

public class ArrayListExemplo2 {
	
	public static void main(String[] args) {
		
		//instanciando arraylist
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();
		ArrayList<Integer> listaDeNumerosNegativos = new ArrayList<Integer>();
		ArrayList<Integer> listaDeNumerosPositivos = new ArrayList<Integer>();
		
		
		//Preenchendo
		//inicializando
		listaDeNumeros.add(-30);
		listaDeNumeros.add(40);
		listaDeNumeros.add(0);
		listaDeNumeros.add(-50);
		listaDeNumeros.add(60);
		listaDeNumeros.add(1,-100);
		listaDeNumeros.add(0,99);
		listaDeNumeros.add(0);
		listaDeNumeros.add(0,-1);
		listaDeNumeros.add(0,2);	
		listaDeNumeros.set(6,-2000);
		
		for(int i = 0; i < listaDeNumeros.size(); i++) {
			if(listaDeNumeros.get(i) < 0) {
				listaDeNumerosNegativos.add(listaDeNumeros.get(i));
			} else {
				if(listaDeNumeros.get(i) > 0) {
					listaDeNumerosPositivos.add(listaDeNumeros.get(i));
				}
			}
		}
		
		for(int i = 0; i < listaDeNumerosNegativos.size(); i++) {
			System.out.println("Lista["+i+"] = "+listaDeNumerosNegativos.get(i));
		}
		
		System.out.println();
		
		for(int i = 0; i < listaDeNumerosPositivos.size(); i++) {
			System.out.println("Lista["+i+"] = "+listaDeNumerosPositivos.get(i));
		}
		
	}

}
