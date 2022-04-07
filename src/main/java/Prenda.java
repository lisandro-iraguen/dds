import Estado.IEstado;


public class Prenda {
    public String tipo;
    public IEstado estado;
    private float precio=0;

    public void setTipo(String nombre){
        tipo=nombre;
    }
    public float precio(){
        return precio;
    }
}
