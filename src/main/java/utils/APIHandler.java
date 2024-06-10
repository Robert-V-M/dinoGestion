/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import dinoModels.Dinosaurio;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;



/**
 *
 * @author DAM
 */
public class APIHandler {
    public static int createSaurio(Dinosaurio saurio){
        
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonObjet = null;
        try {
            jsonObjet = objectMapper.writeValueAsString(saurio);
        } catch (Exception e) {
            System.err.println("error al mapear el objeto saurio");
            return 2;
        }
        
        // Realizar una solicitud HTTP a la APISaurio (FLASK)
        HttpResponse<JsonNode> response = Unirest.post("http://127.0.0.1:5000/createSaurio")
                .header("Content-Type", "application/json")
                .body(jsonObjet)
                .asJson();
        if(response.getStatus() == 200){
            return 0;
        }else{
            return 1;
        }
    }
}
