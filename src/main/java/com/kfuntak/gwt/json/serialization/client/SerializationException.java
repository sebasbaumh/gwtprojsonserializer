package com.kfuntak.gwt.json.serialization.client;

public class SerializationException extends RuntimeException {

	private static final long serialVersionUID = 5904310159515668750L;

	public SerializationException() {
    }

    public SerializationException(String arg0) {
        super(arg0);
    }

    public SerializationException(Throwable arg0) {
        super(arg0);
    }

    public SerializationException(String arg0, Throwable arg1) {
        super(arg0, arg1);
    }
}
