
public class Conversores {
    private double valor, resultado;
    private int moneda1;
    private int moneda2;
    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getMoneda1() {
        return moneda1;
    }

    public void setMoneda1(int moneda1) {
        this.moneda1 = moneda1;
    }

    public int getMoneda2() {
        return moneda2;
    }



    public void setMoneda2(int moneda2) {
        this.moneda2 = moneda2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public Conversores() {
        
   
    }
    
    public double convertir(){
        if (moneda1==0 && moneda2==1){
        resultado = valor * 0.93; 
    }
        else if(moneda1== 0 && moneda2==0){
            resultado = valor; 
        }
        if (moneda2==0 && moneda1==1){
            resultado = valor * 1.08;
        }
    
        return resultado;
    }
}

    


    
    
    

