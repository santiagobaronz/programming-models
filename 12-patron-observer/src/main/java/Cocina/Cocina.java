package Cocina;

import Observador.Observador;
import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(String orden) {
        for (Observador observador : observadores) {
            observador.actualizar(orden);
        }
    }

    public void agregarOrden(String orden) {
        notificarObservadores(orden);
    }
}