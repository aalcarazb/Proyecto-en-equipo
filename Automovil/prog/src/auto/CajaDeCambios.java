package auto;

public class CajaDeCambios {

    /* Atributos privados */
    private int N_MARCHAS;
    private int marcha = 0; // 0 = punto muerto
    private String autor = "APLICUSA";
    private String version = "1.0";

    /* Constructor */
    public CajaDeCambios(int n_marchas) {
        this.N_MARCHAS = n_marchas;
    }
       
    
    /* relacion_marcha_rpm() */
    public float relacion_marcha_rpm() {
        return marcha / 100.f;
    }

    /* inc_marcha() */
    public void inc_marcha() {
        if (marcha < N_MARCHAS) {
            marcha++;
            Log.i("Marcha arriba");
        }
    }

    /* dec_marcha() */
    public void dec_marcha() {
        if (marcha > 0) {
            marcha--;
            Log.i("Marcha abajo");
            if (marcha == 0) {
                Log.i("Punto muerto");
            }
        }
    }
    
    public int getMarcha() {
        return marcha;
    }

    public void puntoMuerto() {
        Log.i("Punto muerto");
        marcha = 0;
    }

    public String getVersion() {
        return version+"-"+autor;
    }

} // CajaDeCambios
