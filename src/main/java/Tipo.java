public class Tipo {
    private float modificador=0;

    public float ModificadorPrecio(float precioOriginal){
        return precioOriginal*modificador;
    }
}
