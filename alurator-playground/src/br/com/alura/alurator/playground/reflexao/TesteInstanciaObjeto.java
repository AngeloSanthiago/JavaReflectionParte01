package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		Obter todas as informações da classe Controle
		
		//1ª Forma de Class - por meio do atributo estatico ".class" da própria classe controle 
		Class<Controle> controleClasse1 = Controle.class;
		
		//2ª Forma de Class - por meio do método "getClass() que todo Objeto possui"
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		//3ª Forma de Class - do método estatico da classe Class
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
//		Obter a INSTANCIA DA CLASSE CONTROLE
		Object objetoControle = controleClasse1.newInstance();
		
		System.out.println(objetoControle instanceof Controle);
	}

}
