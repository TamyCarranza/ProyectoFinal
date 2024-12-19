/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tamar
 */
public class SalaCine {
    private List<String> peliculas = new ArrayList<>();
    private List<String> horarios = new ArrayList<>();
    private String[][] asientos;
    private int filas;
    private int columnas;

    public SalaCine(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.asientos = new String[filas][columnas];
        peliculas.add("Spiderman");
        peliculas.add("Zootopia");
        peliculas.add("Avengers");

        for (int hora = 10; hora <= 22; hora++) {
            horarios.add(hora + ":00");
        }
    }

    public List<String> getPeliculas() {
        return peliculas;
    }

    public List<String> getHorarios() {
        return horarios;
    }

    public boolean asignarAsiento(int fila, int columna, String empleadoId) {
        if (asientos[fila][columna] == null) {
            asientos[fila][columna] = empleadoId;
            return true;
        }
        return false;
    }

    public int getFilas() {
        return filas;
    }

    public int getColumnas() {
        return columnas;
    }
}
