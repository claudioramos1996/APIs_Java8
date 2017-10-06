import java.awt.Button;

import InterfacesFuncionais.Validador;

public class Capitulo3 {
	
	public static void main(String[] args) {
		
		exemploCriacaoInterfaceFuncional();
		exemploAcessandoVariaisComLambda();
	}
	
	private static void exemploAcessandoVariaisComLambda() {
		
		final int numero = 2;
		
		System.out.println("ACESSANDO VARIAVEL LOCAL COM LAMBDA");
		
		new Thread(()->{
			System.out.println("Numero: " + numero);
		}).start();
		
	}

	public static void exemploActionLister(){
		
		Button button = new Button("Teste");
		
		button.addActionListener((event) -> System.out.println("evento do click acionado"));
	}
	
	public static void exemploCriacaoInterfaceFuncional(){
				
		// UTILIZANDO CLASSE INTERNA ANONIMA
		
		System.out.println("VALIDADOR COM CLASSE INTERNA ANONIMA");
		
		Validador<String> validadorDiscreta = new Validador<String>(){

			@Override
			public boolean validar(String valor) {
				return valor.equals("correto");
			}
			
		};
		
		System.out.println(validadorDiscreta.validar("correto"));
		
	
		// UTILIZANDO LAMBDA
		
		System.out.println("VALIDADOR COM LAMBDA");
		
		Validador<String> validadorLambda = texto -> texto.equals("correto");
		
		System.out.println(validadorLambda.validar("correto"));
		
		
	}
}
