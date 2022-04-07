package Estado;

public class Promocion implements IEstado {
    public float cantidadArestar=0;

    @Override
    public float modificadorPrecio(float precioOriginal) {
        return precioOriginal-cantidadArestar;
    }
}
