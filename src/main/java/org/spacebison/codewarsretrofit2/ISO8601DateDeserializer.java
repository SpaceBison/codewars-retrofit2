package org.spacebison.codewarsretrofit2;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;

import java.lang.reflect.Type;
import java.util.Date;

import javax.xml.bind.DatatypeConverter;

public class ISO8601DateDeserializer implements JsonDeserializer<Date> {
    @Override
    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        if (!json.isJsonPrimitive()) {
            return null;
        }

        JsonPrimitive jsonPrimitive = json.getAsJsonPrimitive();
        if (!jsonPrimitive.isString()) {
            return null;
        }

        try {
            return DatatypeConverter.parseDateTime(jsonPrimitive.getAsString()).getTime();
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}
