package xom.shop.Exception;

@SuppressWarnings("serial")
public class NormalException extends NullPointerException {
String message;
	public NormalException(String incomingmessage) {
		super(incomingmessage); 
	}

}
