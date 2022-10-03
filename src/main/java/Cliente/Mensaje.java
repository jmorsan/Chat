package Cliente;

public class Mensaje {

    private int idCliente;
    private String mensaje;

    public Mensaje(int idCliente, String mensaje) {
        this.idCliente = idCliente;
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "("+this.idCliente+") : "+mensaje;
    }
}
