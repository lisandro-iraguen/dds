public class VentaEfectivo extends Venta {
    public float calcularVenta(Prenda prenda){
        return prenda.precio();
    }
}
