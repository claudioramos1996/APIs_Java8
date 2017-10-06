package InterfacesFuncionais;

@FunctionalInterface
public interface Validador<T> {

	boolean validar(T valor);
	
	
}
