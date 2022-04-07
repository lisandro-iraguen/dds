import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Venta {
    public List<Prenda> prendasVendidas= new ArrayList<Prenda>();
    public Date fechaDeLaVenta = new Date();
    public TipoDeVenta tipoDeVenta=TipoDeVenta.TARJETA;
    public int cantidaDeCuotas=1;
    public int COEFICIENTE_CUOTAS=1;


    public void venta(Prenda prenda){
        prendasVendidas.add(prenda);
    }
    public double precioVenta(){
        float precioDeVentaDelDiaSeleccionado=0;
        for (Prenda prenda : prendasVendidas)
        {
            precioDeVentaDelDiaSeleccionado+=(prenda.precio()+calcularDependiendoElTipoDeVenta(prenda));
        }
        return precioDeVentaDelDiaSeleccionado;
    }

    public float calcularDependiendoElTipoDeVenta(Prenda prenda){
        float modificadorPrecio=0;
        switch (tipoDeVenta){
            case TARJETA:
                modificadorPrecio= (float) (cantidaDeCuotas*COEFICIENTE_CUOTAS+ 0.01*prenda.precio());
                break;
            case EFECTIVO:
                break;
        }

        return  modificadorPrecio;
    }
}
