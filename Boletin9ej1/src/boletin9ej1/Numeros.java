
package boletin9ej1;

import javax.swing.JOptionPane;

public class Numeros {
  private int numero;
    //constructor por defecto
    public Numeros(){
        
    }
    //constructor con parametro
    public Numeros(int num1){
        this.numero=num1;
    }
    //metodo pedirDato
    public int pedirDato() {
        String respuesta = JOptionPane.showInputDialog("INTRODUCE NUMERO"); 
        int valor = Integer.parseInt(respuesta);
        return valor;
    }
    //metodo sacarNumeros
    public void sacarNumeros(int num1){
         Numeros obj=new Numeros();
         //estructura repetitiva
        for(num1=1;num1<=10;num1++){
          
             int valor =obj.pedirDato();
           
            if (valor>0){
                JOptionPane.showMessageDialog(null, "El Numero es positivo");
            }
            if (valor<0){
                JOptionPane.showMessageDialog(null, "El Numero es negativo");
            }
            if (valor==0){
                JOptionPane.showMessageDialog(null, "Es cero");
            }
        }
    }   
}
