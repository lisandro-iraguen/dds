public class VentaTarjeta extends Venta {

    public float calcularVenta(Prenda prenda){

            return (float) (super.cantidaDeCuotas*super.COEFICIENTE_CUOTAS+ 0.01*prenda.precio());
    }
}
