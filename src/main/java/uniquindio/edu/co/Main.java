package uniquindio.edu.co;

import javax.swing.*;
import uniquindio.edu.co.model.Hotel;
import uniquindio.edu.co.model.Huesped;
import uniquindio.edu.co.model.Habitacion;
import uniquindio.edu.co.model.Reserva;

public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel(
                "Hotel StayPlus",
                "9001456",
                "Armenia CL 13 CR 13",
                "3001234777",
                "stayplus.com"
        );
        int opcion = 0;
        while (opcion != 14) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    MENU
                    1. Resgistrar huesped
                    2. Consultar huesped (num telefono)
                    3. Verificar si su numero de telefono es un numero perfecto
                    4. Habitaciones y fechas disponibles
                    5. Actualizar estado de disponibilidad
                    6. Crear, confirmar y gestionar estados de reserva
                    7. Agregar habitaciones o servicios extra
                    8. Catalogo de servicios
                    9. Descuento de cliente frecuente
                    10. Valor total de reservas y SVA
                    11. Procesar pagos
                    12. Consultar ingresos acumulados por fecha
                    13. Informacion institucional del hotel
                    14. Salir
                    """));
            if (opcion == 1) {
                String nombreCompleto = JOptionPane.showInputDialog(null, "Ingrese el nombre completo del huesped: ");
                String documentoIdentidad = JOptionPane.showInputDialog("Ingrese el numero del documento de identidad del huesped: ");
                String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del huesped: ");
                String correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del huesped: ");
                String paisProcedencia = JOptionPane.showInputDialog("Ingrese el pais de procedencia del huesped: ");
                hotel.registrarHuesped(nombreCompleto, documentoIdentidad, telefono, correoElectronico, paisProcedencia);
            } else if (opcion == 2) {
                String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del huesped a buscar: ");
                Huesped huesped = hotel.buscarHuesped(telefono);
                if (huesped != null) {
                    JOptionPane.showMessageDialog(null, "Huesped encontrado: " + huesped.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "El huesped no existe");
                }
            } else if (opcion == 3) {
                String numTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono que quiere para comprobarsi es un numero perfecto: ");
                int numPerfect = Integer.parseInt(numTelefono);

                int sumaDivisores = 0;
                for (int i = 1; i < numPerfect; i++) {
                    sumaDivisores += i;
                    if (sumaDivisores == numPerfect) {
                        JOptionPane.showMessageDialog(null, numPerfect + "Es un numero perfecto ");
                    } else {
                        JOptionPane.showMessageDialog(null, numPerfect + "No es un numero perfecto");
                    }
                    break;
                }

            } else if (opcion == 4) {
                int habitacionOpcion = Integer.parseInt(JOptionPane.showInputDialog("""
                        1. Registrar habitacion
                        2. Consultar habitaciones disponibles
                        
                        """));
                if (habitacionOpcion == 1) {
                    String numeroHabitacion = JOptionPane.showInputDialog("Ingrese el numero de la habitacion");
                    String tipo = JOptionPane.showInputDialog("Elija el tipo de habitacion (individual, doble o siute): ");
                    int capacidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad maxima: "));
                    double precioNoche = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio por noche: "));

                    Habitacion nuevaHabitacion = new Habitacion(numeroHabitacion, tipo, capacidadMaxima, precioNoche);
                    hotel.registrarHabitacion(nuevaHabitacion);

                    JOptionPane.showMessageDialog(null, "Se creo la habitacion");
                } else if (habitacionOpcion == 2) {
                    String disponibles = "Habitaciones disponibles: ";
                    for (int i = 0; i < hotel.getListhotelHabitaciones().size(); i++) {
                        Habitacion habitacion = hotel.getListhotelHabitaciones().get(i);
                        if (habitacion.getEstado().contentEquals("Disponible")) {
                            disponibles = disponibles + habitacion.toString() + "\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, disponibles);
                }
            } else if (opcion == 10) {
                String codeReserva = JOptionPane.showInputDialog("Ingrese el codigo de reserva: ");
                Reserva reserva = hotel.buscarReserva(codeReserva);

                if (reserva != null) {
                    double total = reserva.calcularValorTotal();
                    JOptionPane.showMessageDialog(null, "El valor total de la reserva es: " + total);
                } else {
                    JOptionPane.showMessageDialog(null, "No existe reserva para ese codigo");
                }
            } else if (opcion == 11) {
                String codeReserva = JOptionPane.showInputDialog("Ingrese el codigo de la reserva");
                Reserva reserva = hotel.buscarReserva(codeReserva);

                if (reserva != null) {
                    double totalPago = reserva.calcularValorTotal();
                    reserva.procesarPago();
                    JOptionPane.showMessageDialog(null, "Pago procesado \n" + "Metodo de pago: " + reserva.getMetodoPago() + "\n" +
                            "Valor pagado: " + totalPago + "\n" + "Estado de la reserva: " + reserva.getEstado());

                } else {
                    JOptionPane.showMessageDialog(null, "No existe reserva para ese codigo");
                }
            } else if (opcion == 12) {
                String fechaConsultar = JOptionPane.showInputDialog("Ingrese la fecha a consultar: ");
                double ingresos = hotel.calcularIngresosPorFecha(fechaConsultar);
                JOptionPane.showMessageDialog(null, "Los ingresos del " + fechaConsultar + " son: " + ingresos);
            } else if (opcion == 13) {
                JOptionPane.showMessageDialog(null, "Informacion del hotel:\n" + "Nombre comercial: " + hotel.getNombreComercial() + "\n" +
                        "NIT: " + hotel.getNit() + "\n" + "Direccion: " + hotel.getDireccion() + "\n" + "Telefono: " + hotel.getTelefono() + "\n" + "Pagina web: " + hotel.getPaginaWeb());
            } else if (opcion == 14) {
                JOptionPane.showMessageDialog(null, "Saliendo del sistema, adios tonotos");
                break;
            } else if (opcion == 5) {
                String numeroHabitacion = JOptionPane.showInputDialog("Ingrese el numero de la habitacion:");
                String estado = JOptionPane.showInputDialog("""
                        ingrese el nuevo estado de la habitacion
                        disponible 
                        reservada
                        ocupada
                        mantenimiento
                        """);
                boolean actualizado = hotel.actualizarEstadoHabitacion(numeroHabitacion, estado);
                if (actualizado) {
                    JOptionPane.showMessageDialog(null, "Estado de la habitacion actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "La habitacion no existe.");
                }
            } else if (opcion == 6) {
                String codigoReserva = JOptionPane.showInputDialog("Ingrese el codigo de la reserva: ");
                String fechaRealizacion = JOptionPane.showInputDialog("Ingrese la fecha de realizacion: ");
                String fechaEntrada = JOptionPane.showInputDialog("Ingrese la fecha de entrada: ");
                String fechaSalida = JOptionPane.showInputDialog("Ingrese la fecha de salida: ");
                String estado = JOptionPane.showInputDialog("Ingrese el estado de la reserva: ");
                String metodoPago = JOptionPane.showInputDialog("Ingrese el metodo de pago: ");
                double valorTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor total: "));


                boolean creada = hotel.registrarReserva(codigoReserva, fechaRealizacion,
                        fechaEntrada, fechaSalida, estado, metodoPago, valorTotal);

                if (creada) {
                    JOptionPane.showMessageDialog(null, "Reserva registrada correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "La reserva ya existe.");
                }
            } else if (opcion == 7) {
                String codigoReserva = JOptionPane.showInputDialog("Ingrese el codigo de la reserva: ");
                String numeroHabitacion = JOptionPane.showInputDialog("Ingrese el numero de la habitacion: ");
                String codigoServicio = JOptionPane.showInputDialog("Ingrese el codigo del servicio: ");
                hotel.agregarHabitacionReserva(codigoReserva, numeroHabitacion);
                hotel.agregarServicioReserva(codigoReserva, codigoServicio);

                JOptionPane.showMessageDialog(null, "Habitacion y servicio agregados a la reserva.");

            } else if (opcion == 8) {
                String codigo = JOptionPane.showInputDialog("Ingrese el codigo del servicio: ");
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del servicio: ");
                String descripcion = JOptionPane.showInputDialog("Ingrese la descripcion del servicio: ");
                String precio = JOptionPane.showInputDialog("Ingrese el precio del servicio: ");
                String disponibilidad = JOptionPane.showInputDialog("Ingrese la disponibilidad del servicio: ");
                boolean registrado = hotel.registrarServicio(codigo, nombre, descripcion, precio, disponibilidad);
                if (registrado) {
                    JOptionPane.showMessageDialog(null, "Servicio registrado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "El servicio ya existe.");
                }
            } else if (opcion == 9) {
                String documentoIdentidad = JOptionPane.showInputDialog(
                        "Ingrese el documento del huesped: ");
                double descuento = hotel.aplicarDescuentoHuespedFrecuente(Integer.parseInt(documentoIdentidad));

                JOptionPane.showMessageDialog(null,
                        "Descuento aplicado: $" + descuento);

            }

        }
    }
}

















