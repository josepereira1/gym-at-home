/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parseJSON.serializer;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import core.Week;
import java.lang.reflect.Type;

/**
 *
 * @author joaomarques
 */
public class WeekSerializer implements JsonSerializer<Week> {
    
    /**
     * Serialize a Week to a JsonElement.
     * 
     * @param week The week to serialize.
     * @param type
     * @param jsc
     * @return A JsonElement with a Week inside.
     */
    @Override
    public JsonElement serialize(Week week, Type type, JsonSerializationContext jsc) {
        final JsonObject jsonObj = new JsonObject();
        JsonObject workouts = new JsonObject();
        workouts.add("workouts",  jsc.serialize(week.workouts.values().toArray()));
        jsonObj.add("week", workouts);
        return jsonObj;
    }
}
