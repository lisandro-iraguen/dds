package Estado;

public class Liquidacin implements IEstado {


    @Override
    public float modificadorPrecio(float precioOriginal) {
        return (float) (precioOriginal-(precioOriginal*0.5));
    }
}
