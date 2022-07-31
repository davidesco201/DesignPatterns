package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class MyHeroTienda {
    private static void crearInventario(ArrayList<Proveedor> proveedores){
        for (Proveedor proveedor:proveedores) {
            Inventario inventario = proveedor.getInventario();
            inventario.registrarInventario();
        }
    }

    public static void main(String[] args) {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        proveedores.add(new Gibson());
        proveedores.add(new Fender());

        crearInventario(proveedores);
    }
}
