import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Venta {
    public List<Prenda> prendasVendidas= new ArrayList<Prenda>();
    Date today = new Date();

    public void venta(Prenda prenda){

        prendasVendidas.add(prenda);
    }
    public float precioVenta(){
        float precioDeVentaDelDiaSeleccionado=0;
        for (Prenda prenda : prendasVendidas)
        {
            precioDeVentaDelDiaSeleccionado+=prenda.precio();
        }

        return precioDeVentaDelDiaSeleccionado;
    }
}
