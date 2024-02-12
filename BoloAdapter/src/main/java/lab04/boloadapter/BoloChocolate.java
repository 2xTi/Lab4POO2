/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.boloadapter;

/**
 *
 * @author palit
 */
public class BoloChocolate implements BoloChocolateI{


    @Override
    public String prepararMassa(String tipo) {
        return "Bolo com massa de chocolate, ";
    }

    @Override
    public String assar() {
        return "assado por 30 min e, ";
    }

    @Override
    public String colocarCobertura() {
        return "com cobertura de morango.";
    }
    
}
