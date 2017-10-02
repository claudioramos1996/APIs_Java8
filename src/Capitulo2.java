import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {
	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		percorrerComFor(usuarios);

		percorrerComClasseConsumer(usuarios);

		percorrerComClasseDiscreta(usuarios);

		percorrerComClasseLambda(usuarios);

		tornarUsuariosModeradoresComLambda(usuarios);

	}

	private static void tornarUsuariosModeradoresComLambda(List<Usuario> usuarios) {

		// TORNAR USUARIOS MODERADORES COM LAMBDA
		System.out.println("\nTORNAR USUARIOS MODERADORES COM LAMBDA:");
		
		System.out.println("\n ANTES DA ALTERACÃO:");
		
		usuarios.forEach(o -> {
			System.out.println("USUARIO: " + o.getNome() + " é moderador: " + (o.isModerador() ? "SIM" : "NÃO"));
		});
		
		usuarios.forEach(o -> o.tornarModerador());

		System.out.println("\n DEPOIS DA ALTERACÃO:");
		usuarios.forEach(o -> {
			System.out.println("USUARIO: " + o.getNome() + " é moderador: " + (o.isModerador() ? "SIM" : "NÃO"));
		});
	}

	private static void percorrerComClasseLambda(List<Usuario> usuarios) {

		// PERCORRER COM CLASSE DISCRETA
		System.out.println("\nPERCORRER COM LAMBDA:");

		Consumer<Usuario> mostrador = u -> System.out.println(u.getNome());

		System.out.println("\n PRIMEIRA FORMA:");
		usuarios.forEach(mostrador);

		// OU

		System.out.println("\n SEGUNDA FORMA:");
		usuarios.forEach(u -> System.out.println(u.getNome()));

	}

	private static void percorrerComClasseDiscreta(List<Usuario> usuarios) {

		// PERCORRER COM CLASSE DISCRETA
		System.out.println("\nPERCORRER COM CLASSE DISCRETA:");
		usuarios.forEach(new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
			}

		});

	}

	private static void percorrerComClasseConsumer(List<Usuario> usuarios) {
		// PERCORER COM UMA CLASSE QUE IMPLEMENTA O - Consumer
		System.out.println("\nPERCORRER COM CLASSE IMPLEMENTANDO CONSUMER:");
		usuarios.forEach(new Mostrador());
	}

	private static void percorrerComFor(List<Usuario> usuarios) {
		// PERCORRER COM FOR
		System.out.println("\nPERCORRER COM FOR:");
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.getNome());
		}

	}
}
