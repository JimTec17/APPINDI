/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kmyji
 */
public class operaciones {
     private double valor, resultado;
     private int divisa, divisafinal;
     
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa() {
        return divisa;
    }

    public void setDivisa(int divisa) {
        this.divisa = divisa;
    }

    public int getDivisafinal() {
        return divisafinal;
    }

    public void setDivisafinal(int divisafinal) {
        this.divisafinal = divisafinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
     
    //constructor

    public operaciones() {
    }
    
    
    //operaciones
    
    public double convertir(){
        if(divisa==0 && divisafinal==1){
            resultado = valor * 3790;
        }else if(divisa == 0 && divisafinal == 0){
            resultado = valor;
        }else if(divisa==1 && divisafinal==0){
            resultado = valor * 0.000264;
        }
                  
        
        return resultado;
        
    }
     
}
