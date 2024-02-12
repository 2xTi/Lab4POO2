/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lab04.calcadapter;

/**
 *
 * @author palit
 */
public class CalcAdapter {

    public static void main(String[] args) {
        CalculadoraAdapter adapter = new CalculadoraAdapter(new CalculadoraDecimal(),new CalculadoraBinaria());
        
        System.out.println("Soma binaria de 110 + 111 = " + adapter.somar("110", "111"));
        System.out.println("Subtracao binaria de 111 + 110 = " + adapter.subtrair("111", "110"));
        System.out.println("Soma decimal de 5 + 3 = " + adapter.somar(5, 3));
        System.out.println("Subtracao decimal de 5 - 3 = " + adapter.subtrair(5, 3));
        System.out.println("Multiplicacao decimal de 5 * 3 = " + adapter.multiplicar(5, 3));
    }
}
