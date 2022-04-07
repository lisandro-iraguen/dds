package Estado;

import Estado.IEstado;

public class Nuevo implements IEstado {

    @Override
    public float modificadorPrecio(float precioOriginal) {
        return precioOriginal;
    }
}
