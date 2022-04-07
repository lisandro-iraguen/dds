package Tipo;

public class Pantalon implements ITipo {
    private float modificador=0;

    @Override
    public float modificadorPrecio(float precioOriginal){
        return precioOriginal*modificador;
    }
}
