public class Tutorial {
    public static void main(String[] args) {
        GestorJugadores gestorJugadores = new GestorJugadores();
        GestorPartidos gestorPartidos = new GestorPartidos();

        // Añadir un jugador
        Jugador jugador = new Jugador("Juan Pérez", "Delantero", 25);
        gestorJugadores.añadirJugador(jugador);

        // Pagar cuentas de jugadores
        gestorJugadores.pagarCuenta(jugador, 1000);

        // Manejar partidos
        Partido partido = new Partido("Equipo A", "Equipo B", "2023-10-10");
        gestorPartidos.añadirPartido(partido);

        // Mostrar jugadores y partidos
        System.out.println("Jugadores:");
        for (Jugador j : gestorJugadores.getJugadores()) {
            System.out.println(j.getNombre() + " - " + j.getPosicion() + " - " + j.getEdad());
        }

        System.out.println("Partidos:");
        for (Partido p : gestorPartidos.getPartidos()) {
            System.out.println(p.getEquipoA() + " vs " + p.getEquipoB() + " el " + p.getFecha());
        }
    }
}
