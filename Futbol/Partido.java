public class Partido {
    private String equipoA;
    private String equipoB;
    private String fecha;

    public Partido(String equipoA, String equipoB, String fecha) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.fecha = fecha;
    }

    // Getters y setters
    public String getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(String equipoA) {
        this.equipoA = equipoA;
    }

    public String getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(String equipoB) {
        this.equipoB = equipoB;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
