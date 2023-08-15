//Exercicio5
package controller;

public class MDCController {

    public MDCController() {
        super();
    }

    public int macimoDivisorComum(int x, int y){
        if(x == y){
            return x;
        } else if (x < y) {
            return macimoDivisorComum(y, x);
        } else{
            return macimoDivisorComum(x - y, y);
        }
    }
}
