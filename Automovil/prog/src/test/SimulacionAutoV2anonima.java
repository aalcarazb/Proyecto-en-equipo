package test;

import auto.Motor;
import auto.Automovil;
import auto.Log;
import auto.Conexion;

 /**
  * Simulacion automóvil V2 pero con versión anónima
  * 
  * @version 0.0
  * @author Paco Martínez (fjmartin@dcom.upv.es) DCOM-ETSIT-UPV.
  * Fecha de creación: 2021/03/13 00:53:37.
  * Última modificación: 2022/03/07 13:02:35.
  *
  */
public class SimulacionAutoV2anonima {
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
       
        Log.i("Simulación automóvil V2, versión anónima");

        // Automovil coche   = new AutomovilV2(marca_y_modelo, capacidad_deposito, consumo_esperado_100_km, tara, n_marchas, puerto_servidor_telemetria, puerto_servidor_telecontrol);
        Automovil coche = new Automovil(marca_y_modelo, capacidad_deposito, consumo_esperado_100_km, tara, n_marchas, puerto_servidor_telemetria, puerto_servidor_telecontrol) {

            { 
                motor = new Motor(8.f, this) {

                    { 
                        version="2.1"; 
                        autor="APLICUSA";
                    }
                    
                    @Override
                    protected void transitarRPM(float rpm_def) {
                
                        Log.i("transitando en aceleración");

                        preparacionTransicion();
                
                        final float incremento = (rpm_def - getRPM()) / getPASOS();
                        for (int i = 0; i < getPASOS(); i++) {
                            setRPM(getRPM()+incremento);
                            if (romperBucle()) break;
                        } // for
                        Log.i("fin transición aceleración");
                
                    } // transitar
                };

                version="2.1"; 
                autor = "APLICUSA";
            } 
            
        };

    }
}
