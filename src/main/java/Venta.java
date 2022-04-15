import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Venta {
    public List<Prenda> prendasVendidas= new ArrayList<Prenda>();
    public Date fechaDeLaVenta = new Date();
    public int cantidaDeCuotas=1;
    public int COEFICIENTE_CUOTAS=1;


    public void venta(Prenda prenda){
        prendasVendidas.add(prenda);
    }
    public double precioVenta(){
        float precioDeVentaDelDiaSeleccionado=0;
        for (Prenda prenda : prendasVendidas)
        {
            precioDeVentaDelDiaSeleccionado+=(prenda.precio()+tipoDeVenta(prenda));
        }
        return precioDeVentaDelDiaSeleccionado;
    }
    public float tipoDeVenta(Prenda prenda){
        return prenda.precio();
    }

}
