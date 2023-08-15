package view;

import controller.MDCController;

public class Main {
    public static void main(String[] args) {

        MDCController mdc = new MDCController();

        int resultado = mdc.macimoDivisorComum(24,25);

        System.out.println(resultado);
    }
}