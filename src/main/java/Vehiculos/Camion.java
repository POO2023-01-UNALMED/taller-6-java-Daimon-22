package Vehiculos;

public class Camion extends Vehiculo{
    private int ejes;
    private static int cantidadCamion;
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante,int ejes){
        super(placa,2,80,nombre,precio,peso,"4X2",fabricante);
        this.ejes=ejes;
        Camion.cantidadCamion++;

    }
    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }
    public static int getCantidadCamion() {
        return cantidadCamion;
    }

    public static void setCantidadCamion(int cantidadCamion) {
        Camion.cantidadCamion = cantidadCamion;
    }

}
