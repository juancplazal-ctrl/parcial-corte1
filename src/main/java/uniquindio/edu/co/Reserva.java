package uniquindio.edu.co;

public class Reserva {
    private String codigo, fechaRealizacion, fechaEntrada, fechaSalida, estado, metodoPago;
    private double valorTotal;
    public Reserva(String codigo,String fechaRealizacion, String fechaEntrada, String fechaSalida,String estado,String metodoPago,double valorTotal){
        this.codigo=codigo;
        this.fechaRealizacion=fechaRealizacion;
        this.fechaEntrada=fechaEntrada;
        this.fechaSalida=fechaSalida;
        this.estado=estado;
        this.metodoPago=metodoPago;
        this.valorTotal=valorTotal;
    }
}
