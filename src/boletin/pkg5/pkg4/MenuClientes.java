package boletin.pkg5.pkg4;

public class MenuClientes {

    int personas, pulpo, patatas;
//builder

    public MenuClientes() {

    }

    /*   public MenuClientes(int pers) {
     personas = pers;
     }*/
//method
    public void setPatatas(int p) {
        patatas = p;
    }

    public void añadirPatatas(int x) {
        patatas+=x;
    }

    public void setPulpo(int y) {
        pulpo = y;
    }

    public void añadirPulpo(int x) {
        pulpo+=x;
    }

    public int getNumClientes() {
        return personas = (3 * pulpo) / 2;

    }
    /*  public void getNumClientes(){
     System.out.println(" nº persoas = "+ (3 * pulpo) / 2);
     }*/

}
