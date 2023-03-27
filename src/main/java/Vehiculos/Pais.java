package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    public static ArrayList<Pais> paises=new ArrayList<Pais>();

    public Pais(String nombre){
        this.nombre=nombre;
        paises.add(this);
    }
    public static Pais paisMasVendedor(){
        int[] unidades = new int[paises.size()];
        for(int i=0; i<paises.size(); i++){
            unidades[i]=0;
        }
        int indice=0;
        for (Pais pais: paises){
            for (Fabricante fabricante: Fabricante.fabricantes){
                if(fabricante.getPais()==pais){
                    unidades[paises.indexOf(pais)]++;
                }
            }
        }
        int mayorVenta=unidades[0];
        for (int i=1; i< unidades.length;i++){
            if (unidades[i]>mayorVenta){
                mayorVenta=unidades[i];
                indice=i;
            }
        }
        return paises.get(indice);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
