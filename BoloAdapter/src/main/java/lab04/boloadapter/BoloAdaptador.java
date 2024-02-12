/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04.boloadapter;

/**
 *
 * @author palit
 */
public class BoloAdaptador implements BoloI{

    private BoloChocolateI boloCI;
    private BoloVermelhoI boloVI;
    
    
    BoloAdaptador(BoloChocolateI boloCI, BoloVermelhoI boloVI){
        this.boloCI = boloCI;
        this.boloVI = boloVI;
    }

    @Override
    public String prepararMassa(String tipo) {
        // Lógica para determinar qual tipo de bolo está sendo utilizado e chamar o método correspondente
        if ("chocolate".equalsIgnoreCase(tipo)) {
            return this.boloCI.prepararMassa(tipo);
        } else if ("vermelho".equalsIgnoreCase(tipo)) {
            return this.boloVI.prepararMassa(tipo);
        } else {
            return "Tipo de bolo não suportado";
        }
    }

    public String assar(String tipo) {
        if ("chocolate".equalsIgnoreCase(tipo)) {
            return this.boloCI.assar();
        } else if ("vermelho".equalsIgnoreCase(tipo)) {
            return this.boloVI.assar();
        } else {
            return "Tipo de bolo não suportado";
        }
    }

    public String colocarCobertura(String tipo) {
        if ("chocolate".equalsIgnoreCase(tipo)) {
            return this.boloCI.colocarCobertura();
        } else if ("vermelho".equalsIgnoreCase(tipo)) {
            return this.boloVI.colocarCobertura();
        } else {
            return "Tipo de bolo não suportado";
        }
    }
    
}
