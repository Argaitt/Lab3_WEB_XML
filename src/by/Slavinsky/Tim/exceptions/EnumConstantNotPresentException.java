package by.Slavinsky.Tim.exceptions;

public class EnumConstantNotPresentException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public EnumConstantNotPresentException() {
	}
	
	public EnumConstantNotPresentException(String msg) {
		super(msg);
	}
	
}
