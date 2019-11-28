package sk.upjs.kniznica;

public class KnihaNotFoundException extends RuntimeException {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6494887546033164903L;

	public KnihaNotFoundException(String message) {
		super(message);
	}
}
