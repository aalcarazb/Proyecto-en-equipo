package auto;

public class Deposito {
    // Faltan algunos atributos privados
    private float nivel;
    private float CAPACIDAD; // litros

    private final float DENSIDAD_COMBUSTIBLE = 0.8f; // kg/l
    private String autor = "APLICUSA";
    private String version = "1.0";



    /* Constructor */
    public Deposito(float capacidad) {
        this.CAPACIDAD = capacidad;
    }


    /* repostar */
    public float repostar(float litros) {
        if (litros <= 0.f) {
            return litros;
        }
        nivel += litros;
        float sobrante = 0.f;
        if (nivel > CAPACIDAD) {
            sobrante = nivel - CAPACIDAD;
            nivel = CAPACIDAD;
        }
        return sobrante;
    }

    
    public boolean consumir(float litros) {
        nivel -= litros;
        if (nivel <= 0.f) {
            nivel = 0.f;
            return false;
        }
        return true;
    }

    public float peso() {
        return nivel * DENSIDAD_COMBUSTIBLE;
    }

    public float getCAPACIDAD() {
        return CAPACIDAD;
    }

    public float getNivel() {
        return nivel;
    }

    public float getDENSIDAD_COMBUSTIBLE() {
        return DENSIDAD_COMBUSTIBLE;
    }

    public String getVersion() {
        return version+"-"+autor;
    }



}
