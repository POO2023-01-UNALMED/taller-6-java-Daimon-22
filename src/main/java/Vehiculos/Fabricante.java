package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public static ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
        fabricantes.add(this);
    }
    public static Fabricante fabricaMayorVenta() {
        int[] unidades = new int[fabricantes.size()];
        for (int i = 0; i < fabricantes.size(); i++) {
            unidades[i] = 0;
        }
        int indice = 0;
        for (Fabricante fabrica : fabricantes) {
            for (Vehiculo vehiculo : Vehiculo.tipoVehiculos) {
                if (vehiculo.getFabricante() == fabrica) {
                    unidades[fabricantes.indexOf(fabrica)]++;
                }
            }
        }
        int mayorFabricante = unidades[0];
        for (int i = 1; i < unidades.length; i++) {
            if (unidades[i] > mayorFabricante) {
                mayorFabricante = unidades[i];
                indice=i;
            }
        }
      return fabricantes.get(indice);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
