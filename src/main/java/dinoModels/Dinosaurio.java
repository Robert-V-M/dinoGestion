/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinoModels;

/**
 *
 * @author DAM
 */
public class Dinosaurio {
    private String nombreSaurio;
    private String dinoPoder;
    private int dinoEdad;
    private String dinoAlimentacion;

    
    public Dinosaurio(){
    
    }
    
    public Dinosaurio(String nombreSaurio,String dinoPoder, int dinoEdad, String dinoAlimentacion) {
        this.nombreSaurio = nombreSaurio;
        this.dinoPoder = dinoPoder;
        this.dinoEdad = dinoEdad;
        this.dinoAlimentacion = dinoAlimentacion;
    }

    public String getNombreSaurio() {
        return nombreSaurio;
    }

    public void setNombreSaurio(String nombreSaurio) {
        this.nombreSaurio = nombreSaurio;
    }

    public String getDinoPoder() {
        return dinoPoder;
    }

    public void setDinoPoder(String dinoPoder) {
        this.dinoPoder = dinoPoder;
    }

    public int getDinoEdad() {
        return dinoEdad;
    }

    public void setDinoEdad(int dinoEdad) {
        this.dinoEdad = dinoEdad;
    }

    public String getDinoAlimentacion() {
        return dinoAlimentacion;
    }

    public void setDinoAlimentacion(String dinoAlimentacion) {
        this.dinoAlimentacion = dinoAlimentacion;
    }
    
    
    
}
