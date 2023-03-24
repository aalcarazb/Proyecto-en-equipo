package test;

import auto.Automovil;
import auto.AutomovilV2;
import auto.AutomovilV3;
import auto.Conexion;
import auto.Log;


/**
 * Simulación Automóvil versión 2
 * 
 * @version 1.0
 * @author Paco Martínez (fjmartin@dcom.upv.es) DCOM-ETSIT-UPV.
 * Fecha de creación: 2021/03/12 21:14:27.
 * Última modificación: 2021/03/13 09:25:56.
 *
 */
public class SimulacionAutoV3 {
    /**
     * Main
     * @param args argumentos
     */
    public static void main(String[] args) {

        int puerto_servidor_telemetria = Conexion.PUERTO_SERVIDOR_TELEMETRIA_DEFAULT;
        int puerto_servidor_telecontrol = Conexion.PUERTO_SERVIDOR_TELECONTROL_DEFAULT;

        if (args.length >= 1) {
            puerto_servidor_telemetria = Integer.parseInt(args[0]);
        } 
        if (args.length >= 2) {
            puerto_servidor_telecontrol = Integer.parseInt(args[1]);
        } 

        String marca_y_modelo = "Renault 5";
        int capacidad_deposito = 45;
        float consumo_esperado_100_km = 8.5f;
        float tara = 1000.f;
        int n_marchas = 5;
        int max_pasajeros = 5;
       
        Log.i("Simulación automóvil V3");

        Automovil coche   = new AutomovilV3(marca_y_modelo, capacidad_deposito, consumo_esperado_100_km, tara, n_marchas, 
        puerto_servidor_telemetria, puerto_servidor_telecontrol, max_pasajeros);

    }
}
