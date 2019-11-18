package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		O usu�rio vai passar uma url no formato aproximado de /controle/lista para que a classe Controle seja instanciada
//		Obter todas as informa��es da classe Controle
		
		//1� Forma de Class - por meio do atributo estatico ".class" da pr�pria classe Controle 
		Class<Controle> controleClasse1 = Controle.class;
		
		//2� Forma de Class - por meio do m�todo "getClass() que todo Objeto possui"
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		//3� Forma de Class - do m�todo estatico da classe Class
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
//		Obter a INSTANCIA DA CLASSE CONTROLE
		@SuppressWarnings("deprecation")
		Object objetoControle1 = controleClasse1.newInstance();//tamb�m funciona com o tipo "Controle" para a vari�vel objetoControle
		
		Object outroObjetoControle = controleClasse3.newInstance();//nao funciona com o tipo "Controle" para a vari�vel outroObjetoControle.
		
		System.out.println(objetoControle1 instanceof Controle);
		System.out.println(outroObjetoControle instanceof Controle);
	}

}
