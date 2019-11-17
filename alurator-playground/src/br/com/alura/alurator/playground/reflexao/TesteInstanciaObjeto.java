package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Obter todas as informa��es da classe Controle
		
		//1� Forma de Class - por meio do atributo estatico ".class" da pr�pria classe controle 
		Class<Controle> controleClasse1 = Controle.class;
		
		//2� Forma de Class - por meio do m�todo "getClass() que todo Objeto possui"
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		//3� Forma de Class - do m�todo estatico da classe Class
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
//		Obter a INSTANCIA DA CLASSE CONTROLE
		Object objetoControle = controleClasse1.newInstance();
		
		System.out.println(objetoControle instanceof Controle);
	}

}
