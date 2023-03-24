// Pertenencia al paquete test
package test;

// Requiere las siguientes clases ubicadas en el paquete auto
import auto.Automovil;
import auto.Conexion;
import auto.Log;

/**
 * Clase SimulacionAuto.
 *
 * Crea un objeto {@link auto.Automovil} funcional atendiendo peticiones de control así como peticiones de telemetría en sendos puertos
 * 
 * @version 1.1
 * @author Paco Martínez (fjmartin@dcom.upv.es) DCOM-ETSIT-UPV.
 * Fecha de creación: 2021/03/12 21:14:27.
 * Última modificación: 2022/03/05 18:45:18.
 *
 * Invocación desde línea de comandos:
 * 
 * $ java -cp <DIRECTORIO_RAIZ_DE_CLASES> test.SimulacionAuto [PUERTO_TELEMETRIA [PUERTO_TELECONTROL]]
 * 
 * donde:
 *   <DIRECTORIO_RAIZ_DE_CLASES>: directorio donde se guardan las clases cualificadas 
 *                                (probablemente será el directorio bin)
 *    PUERTO_TELEMETRIA (opcional): si se indica, es el puerto en el que el simulador atiende peticiones 
 *                                  de telemetría. Valor por defecto: 34567
 *    PUERTO_TELECONTROL (opcional): si se ha especificado PUERTO_TELEMETRIA, entonces si se indica, es 
 *                                   el puerto en el que el simulador atiende a las peticiones de 
 *                                   telecontrol. Valor por defecto: 34568
 */


public class SimulacionAuto {

    /**
     * Main
     * @param args argumentos
     *  args[0]: puerto de atención de telemetría
     *  args[1]: puerto de atención de telecontrol
     */
    public static void main(String[] args) {


        // Puertos de atención de peticiones de telemetría y telecontrol: 
        int puerto_servidor_telemetria = Conexion.PUERTO_SERVIDOR_TELEMETRIA_DEFAULT;
        int puerto_servidor_telecontrol = Conexion.PUERTO_SERVIDOR_TELECONTROL_DEFAULT;

        if (args.length >= 1) {
            puerto_servidor_telemetria = Integer.parseInt(args[0]);
        } 
        if (args.length >= 2) {
            puerto_servidor_telecontrol = Integer.parseInt(args[1]);
        } 
       

        /* Marca y modelo del automóvil */
        String marca_y_modelo = "Renault 5";
        /* Capacidad del depósito en litros */
        int capacidad_deposito = 45;
        /* Consumo esperado o estiamdo, bajo ciertas condiciones no especificadas, a los 100 km */
        float consumo_esperado_100_km = 8.5f;
        /* Peso del vehículo en vacío */
        float tara = 1000.f;
        /* Nümero de marchas de la caja de cambios */
        int n_marchas = 5;

        Log.i("Simulación automóvil");

        /* Creación de un objeto Automóvil y comienzo automático de simulación */
        Automovil coche = new Automovil(marca_y_modelo, capacidad_deposito, consumo_esperado_100_km, 
                                        tara, n_marchas, puerto_servidor_telemetria, 
                                        puerto_servidor_telecontrol);

    } // main

} // SimulacionAuto
