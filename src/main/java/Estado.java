public class Estado {
    public float factorModificador=0;
    public float ModificadorDelPrecio(float precioOriginal){
        return precioOriginal*factorModificador;
    };
}
