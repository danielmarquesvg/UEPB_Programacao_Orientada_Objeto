package exercicio_recursividade;

/* Implemente em Java uma função iterativa e outra função recursiva para 
encontrar o número de maior valor em um array. 
Ambas as funções devem receber como parâmetro um array de 
inteiros e retorna um número inteiro que representa o número 
de maior valor do array.
*/

public class Main
{
	public static void main(String[] args) {
	    
	    int [] num = {3, 5, 37, 23, 14};
	    int tamanho = num.length;
	    
	    int resultadoI = maiorIterativo(num);
	   // int resultadoR = 
	    
	    System.out.print("O maior numero encontrado na funcao iterativa é: "+resultadoI);
	  //  System.out.print("\nO maior numero encontrado na funcao recursiva é:"+resultadoR);
	    
	    
	}



// iterativa

public static int maiorIterativo(int [] num){
    	   
	int maiorI = num[0];
    
    for (int i = 1; i < num.length; i++){
        if(num[i] >= maiorI){
            maiorI = num[i];
        }
    }
    
    return maiorI;
    
}
}


// recursiva

/*public static int maiorRecursiva(int [] num, int i){
    
    if(i == (num.length - 1)){
        
        return num[i];
    }
    else{
        
    }
    
 

    
}*/