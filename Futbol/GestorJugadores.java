import java.util.ArrayList;
import java.util.List;

public class GestorJugadores {
    private List<Jugador> jugadores;

    public GestorJugadores() {
        jugadores = new ArrayList<>();
    }

    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void pagarCuenta(Jugador jugador, double cantidad) {
        // Lógica para pagar la cuenta del jugador
        System.out.println("Pagado " + cantidad + " a " + jugador.getNombre());
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
}
