/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba4;

/**
 *
 * @author tamar
 */
public class Actividad {
    private String tipo;
    private String horario;
    private int cupo;
    private String[] reservas;

    public Actividad(String tipo, String horario, int cupo) {
        this.tipo = tipo;
        this.horario = horario;
        this.cupo = cupo;
        this.reservas = new String[cupo];
    }

    public void modificarCupo(int nuevoCupo) {
        this.cupo = nuevoCupo;
        this.reservas = new String[nuevoCupo]; // Reiniciar reservas
    }

    public void modificarHorario(String nuevoHorario) {
        this.horario = nuevoHorario;
    }

    public boolean reservar(String empleadoId) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = empleadoId;
                return true;
            }
        }
        return false;
    }

    public void liberarReserva(String empleadoId) {
        for (int i = 0; i < reservas.length; i++) {
            if (empleadoId.equals(reservas[i])) {
                reservas[i] = null;
                break;
            }
        }
    }

    public void mostrarReservas() {
        for (int i = 0; i < reservas.length; i++) {
            System.out.println((i + 1) + ": " + (reservas[i] == null ? "Espacio disponible" : "Reservado por ID: " + reservas[i]));
        }
    }
}
