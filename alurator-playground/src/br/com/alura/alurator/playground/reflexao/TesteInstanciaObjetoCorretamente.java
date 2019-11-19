package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException,  ClassNotFoundException {
		
		
//		Class<SubControle> subControleClasse1 = SubControle.class; // Obter CLASS FORMA 01
		//Obtem o construtor publico sem parâmetros de Subcontrole
//		Constructor<SubControle> constructorSubControle = subControleClasse1.getConstructor();
		
		//Obtem o construtor privado com um parâmetros String de Subcontrole
//		Constructor<SubControle> constructorSubControle = subControleClasse1.getDeclaredConstructor(String.class);
		
		//Obtem o construtor privado sem parâmetros de Subcontrole
		/*Constructor<SubControle> constructorSubControle = subControleClasse1.getDeclaredConstructor();
		
		System.out.println(constructorSubControle);
		
		constructorSubControle.setAccessible(true);
		Object subControle = constructorSubControle.newInstance();
		
		System.out.println(subControle);*/
		
		
		Class<?> controleClasse1 = Class.forName("br.com.alura.alurator.playground.controle.Controle"); // Obter instância de Class FORMA02
		try {
			controleClasse1.getDeclaredConstructor().newInstance();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
			System.out.println(e.getTargetException());
		}
//		controleClasse1.newInstance(); // falha execução devido exceção lançada pelo construtor.
	}
}
