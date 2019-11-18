package br.com.alura.alurator.playground.reflexao;

import br.com.alura.alurator.playground.controle.Controle;

public class TesteInstanciaObjeto {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		O usuário vai passar uma url no formato aproximado de /controle/lista para que a classe Controle seja instanciada
//		Obter todas as informações da classe Controle
		
		//1ª Forma de Class - por meio do atributo estatico ".class" da própria classe Controle 
		Class<Controle> controleClasse1 = Controle.class;
		
		//2ª Forma de Class - por meio do método "getClass() que todo Objeto possui"
		Controle controle = new Controle();
		Class<? extends Controle> controleClasse2 = controle.getClass();
		
		//3ª Forma de Class - do método estatico da classe Class
		Class<?> controleClasse3 = Class.forName("br.com.alura.alurator.playground.controle.Controle");
		
//		Obter a INSTANCIA DA CLASSE CONTROLE
		@SuppressWarnings("deprecation")
		Object objetoControle1 = controleClasse1.newInstance();//também funciona com o tipo "Controle" para a variável objetoControle
		
		Object outroObjetoControle = controleClasse3.newInstance();//nao funciona com o tipo "Controle" para a variável outroObjetoControle.
		
		System.out.println(objetoControle1 instanceof Controle);
		System.out.println(outroObjetoControle instanceof Controle);
	}

}
