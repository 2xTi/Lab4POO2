/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.boloadapter;

/**
 *
 * @author palit
 */
public class BoloVermelho implements BoloVermelhoI{
    
    @Override
    public String prepararMassa(String tipo) {
        return "Bolo com massa de morango, ";
    }

    @Override
    public String assar() {
        return "assado por 25 min e, ";
    }

    @Override
    public String colocarCobertura() {
        return "com cobertura de chocolate.";
    }

    
}
