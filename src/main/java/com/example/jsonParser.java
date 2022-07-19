package com.example;

import java.util.List;
import com.google.gson.Gson;

public class jsonParser {

    public static List<Filme> parse(String json){
        Gson gson = new Gson();
        ApiResponse apiResponse = gson.fromJson(json, ApiResponse.class);
        return apiResponse.getItems();
    }
    
}
