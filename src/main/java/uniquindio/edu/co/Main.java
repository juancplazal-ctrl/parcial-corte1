package uniquindio.edu.co;

import javax.swing.*;
import uniquindio.edu.co.model.Hotel;
import uniquindio.edu.co.model.Huesped;

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
        while(opcion != 14){
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
        if(opcion == 1) {
            String nombreCompleto = JOptionPane.showInputDialog(null, "Ingrese el nombre completo del huesped: ");
            int documentoIdentidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del documento de identidad del huesped: "));
            String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del huesped: ");
            String correoElectronico = JOptionPane.showInputDialog("Ingrese el correo electronico del huesped: ");
            String paisProcedencia = JOptionPane.showInputDialog("Ingrese el pais de procedencia del huesped: ");
            hotel.registrarHuesped(nombreCompleto, documentoIdentidad, telefono, correoElectronico, paisProcedencia);
        }else if(opcion == 2){
            String telefono = JOptionPane.showInputDialog("Ingrese el numero de telefono del huesped a buscar: ");
            Huesped huesped = hotel.buscarHuesped(Integer.parseInt(telefono));
            if(huesped != null){
                JOptionPane.showMessageDialog(null, "Huesped encontrado: " + huesped.toString() );
            }else{
                JOptionPane.showMessageDialog(null, "El huesped no existe");
            }
        }else if(opcion == 3){
            String numTelefono = JOptionPane.showInputDialog("Ingrese el numero de telefono que quiere para comprobarsi es un numero perfecto: ");
            int numPerfect = Integer.parseInt(numTelefono);

            int sumaDivisores = 0;
            for(int i = 1; i < numPerfect; i++){
                if(numPerfect % i == 0){
                    sumaDivisores += i;
                }
            if(sumaDivisores == numPerfect){
                JOptionPane.showMessageDialog(null, numPerfect + "Es un numero perfecto ");
            }else{
                JOptionPane.showMessageDialog(null, numPerfect + "No es un numero perfecto");
            }
            }
            break;
        }else if(opcion == 4){
            
        }









        }


    }
}

