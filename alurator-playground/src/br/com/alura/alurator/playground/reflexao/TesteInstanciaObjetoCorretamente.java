package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TesteInstanciaObjetoCorretamente {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<SubControle> subControleClasse1 = SubControle.class;
		//Obtem o construtor publico sem parâmetros de Subcontrole
//		Constructor<SubControle> constructorSubControle = subControleClasse1.getConstructor();
		
		//Obtem o construtor privado com um parâmetros String de Subcontrole
//		Constructor<SubControle> constructorSubControle = subControleClasse1.getDeclaredConstructor(String.class);
		
		//Obtem o construtor privado sem parâmetros de Subcontrole
		Constructor<SubControle> constructorSubControle = subControleClasse1.getDeclaredConstructor();
		
		System.out.println(constructorSubControle);
		
		constructorSubControle.setAccessible(true);
		Object subControle = constructorSubControle.newInstance();
		
		System.out.println(subControle);
	}
}
