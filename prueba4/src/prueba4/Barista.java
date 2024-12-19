/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba4;

/**
 *
 * @author tamar
 */
public class Barista {
    private String[] menu = {"Café normal", "Capuchino", "Capuchino con vainilla", "Chocolate", "Moka", "Té chai", "Café frío"};
    private String[][] reservas;

    public Barista(int maxEmpleados) {
        this.reservas = new String[maxEmpleados][2];
    }

    public boolean reservarBebida(String empleadoId, String bebida, String hora) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i][0] == null) {
                reservas[i][0] = empleadoId;
                reservas[i][1] = bebida + " a las " + hora;
                return true;
            } else if (reservas[i][0].equals(empleadoId)) {
                return false; // Ya tiene una reserva
            }
        }
        return false;
    }

    public void modificarReserva(String empleadoId, String nuevaBebida, String nuevaHora) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i][0] != null && reservas[i][0].equals(empleadoId)) {
                reservas[i][1] = nuevaBebida + " a las " + nuevaHora;
                break;
            }
        }
    }

    public void listarReservas() {
        for (String[] reserva : reservas) {
            if (reserva[0] != null) {
                System.out.println("Empleado: " + reserva[0] + " - Bebida: " + reserva[1]);
            }
        }
    }
}
