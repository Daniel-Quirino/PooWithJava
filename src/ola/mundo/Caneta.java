
package ola.mundo;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void rabiscar(){
        
    }
    
    void tampar(){
        this.tampada = false;
    }
    
    void destampar(){
        this.tampada = true;
    }
    
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("está tampada: " + this.tampada);
    }
    
}
    


