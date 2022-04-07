import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Facturacion {
    public List<Venta> ventas= new ArrayList<Venta>();

    public double ventasDe(Date dia){
        List<Venta> ventasDelDiaSeleccionado = ventas.stream()
                .filter(p -> p.fechaDeLaVenta == dia).collect(Collectors.toList());
        double sumaTotal = ventasDelDiaSeleccionado.stream()
                .mapToDouble(a -> a.precioVenta())
                .sum();
        return sumaTotal;
    }
}
