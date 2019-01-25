package com.kfuntak.gwt.json.serialization.client;

import com.google.gwt.json.client.JSONException;
import com.google.gwt.json.client.JSONParser;
import com.google.gwt.json.client.JSONValue;

public abstract class AbstractObjectSerializer implements ObjectSerializer {
    @Override
	public String serialize(Object pojo) {
        return serializeToJson(pojo).toString();
    }

    @Override
	public abstract JSONValue serializeToJson(Object pojo);

    @Override
	public abstract Object deSerialize(JSONValue jsonValue, String className) throws JSONException;

    @Override
	public Object deSerialize(String jsonString, String className) throws JSONException {
        return deSerialize(JSONParser.parseStrict(jsonString), className);
    }

    @Override
	public Object deSerialize(JSONValue jsonValue) throws JSONException {
        return deSerialize(jsonValue, null);
    }
}
