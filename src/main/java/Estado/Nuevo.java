package Estado;

import Estado.IEstado;

public class Nuevo implements IEstado {
    public float factorModificador=0;

    @Override
    public float modificadorPrecio(float precioOriginal) {
        return precioOriginal*factorModificador;
    }
}
