
package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    public static int numTV;
    
    
    public TV(Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        canal = 1;
        volumen = 1;
        precio = 500;
        numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

   public void setCanal(int canal) {
        if (canal<=120 && canal>=1 && estado == true){
            this.canal = canal;
        }
        
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public static int getNumTV() {
        return numTV;
    }
    
    public void turnOn(){
        estado = true;
    }
    
    public void turnOff(){
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }
    
    public void canalUp(){
        if ((canal+1)<=120){
            canal++;
        }
    }
    
    public void canalDown(){
        if ((canal-1)>=1){
            canal--;
        }
    }
    
    public void volumenUp(){
        if (estado == true && (volumen+1) <= 7){
            volumen++;
        }
    }
    
    public void volumenDown(){
        if (estado == true &&(volumen-1) >= 0){
            volumen--;
        }
    }
    
}
