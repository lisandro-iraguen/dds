package Estado;

public class Liquidacin implements IEstado {
    public float factorModificador=0;

    @Override
    public float modificadorPrecio(float precioOriginal) {
        return precioOriginal*factorModificador;
    }
}
