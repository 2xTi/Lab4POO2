/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab04.boloadapter;

/**
 *
 * @author palit
 */
public class BoloAdapter {

    public static void main(String[] args) {
        BoloAdaptador adapter = new BoloAdaptador(new BoloChocolate(),new BoloVermelho());
        
        System.out.println(adapter.prepararMassa("chocolate") + adapter.assar("chocolate") + adapter.colocarCobertura("chocolate"));
        System.out.println(adapter.prepararMassa("azul"));
        System.out.println(adapter.prepararMassa("vermelho") + adapter.assar("vermelho") + adapter.colocarCobertura("vermelho"));
    }
}
