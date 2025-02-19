package com.mycompany.persistence;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author adria
 */
public class JSONManager {
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .registerTypeAdapter(LocalDateTime.class, new JsonSerializer<LocalDateTime>() {
                private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

                @Override
                public JsonElement serialize(LocalDateTime localDateTime, java.lang.reflect.Type type, JsonSerializationContext jsonSerializationContext) {
                    return new JsonPrimitive(localDateTime.format(formatter));
                }
            })
            .registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
                private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

                @Override
                public LocalDateTime deserialize(JsonElement json, java.lang.reflect.Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDateTime.parse(json.getAsString(), formatter);
                }
            })
            .registerTypeAdapter(LocalDate.class, new JsonSerializer<LocalDate>() {
                private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

                @Override
                public JsonElement serialize(LocalDate localDate, java.lang.reflect.Type type, JsonSerializationContext jsonSerializationContext) {
                    return new JsonPrimitive(localDate.format(formatter));
                }
            })
            .registerTypeAdapter(LocalDate.class, new JsonDeserializer<LocalDate>() {
                private final DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

                @Override
                public LocalDate deserialize(JsonElement json, java.lang.reflect.Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
                    return LocalDate.parse(json.getAsString(), formatter);
                }
            })
//            .registerTypeAdapter(LocalTime.class, new LocalTimeAdapter())
            .create();

    // Método genérico para salvar uma lista de objetos no arquivo JSON
    public static <T> void salvarLista(String caminhoArquivo, List<T> lista) {
        try (Writer writer = new FileWriter(caminhoArquivo)) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método genérico para carregar uma lista de objetos do arquivo JSON
    public static <T> List<T> carregarLista(String caminhoArquivo, TypeToken<List<T>> typeToken) {
        try (Reader reader = new FileReader(caminhoArquivo)) {
            return gson.fromJson(reader, typeToken.getType());
        } catch (IOException e) {
            return new java.util.ArrayList<>(); // Retorna uma lista vazia caso o arquivo não exista
        }
    }
}
