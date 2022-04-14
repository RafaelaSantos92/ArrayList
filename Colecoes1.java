package Familia51;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes1 {

	public static void main(String[] args) {
		
		
		Collection<String> nomes = new ArrayList();
		nomes.add("Rafa");
		nomes.add("Marta");
		nomes.add("Rose");
		nomes.add("José");
		nomes.add("João");
		nomes.add("Juliana");
		
		for(String name : nomes) //Percorrer todos os nomes da lista*
		{
			System.out.println("\nLista de nomes: "+name);
		}
		
		
		
		
		/*Collection<String> nomes2 = Arrays.asList("Bruna","Julia"); // Adicionr outra lista*
		nomes.addAll(nomes2);
		System.out.println("\nLista de nomes: "+nomes);
		
		
		
		
		/*System.out.println("\nContém algum nome Rafa? "+nomes.contains("Rafa")); // Verificar se existe o item desejado na lista*
		System.out.println("\nLista: "+nomes);
				
		/*nomes.clear();            //limpar lista**
		System.out.println("\nLista de nomes: "+nomes);
		
		/*nomes.remove("José");     //remover algum item da lista*
		System.out.println("\nLista de nomes: "+nomes);
		
		/*if(nomes.isEmpty())       //procurar se tem algum item vazio na lista*
		{
			System.out.println("\nLista vazia...");
		}
		else
		{
			System.out.println("\nLista de nomes: "+nomes);
		}
		*/
		
		
		
	}

}
