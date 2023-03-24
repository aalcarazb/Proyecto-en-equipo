package auto;

public class AutomovilV2 extends Automovil {

    public AutomovilV2(String modelo, float capacidad_deposito, float consumo_100_km, float tara, int n_marchas, int puerto_servidor_telemetria, int puerto_servidor_telecontrol) {

        super(modelo, capacidad_deposito, consumo_100_km, tara, n_marchas, puerto_servidor_telemetria, puerto_servidor_telecontrol);
        motor = new MotorV2(8.f, this);  // Actualización del motor con el modelo nuevo MotorV2: ¡polimorfismo!
        
        version = "2.0"; // Nueva versión
        autor = "APLICUSA"; // Recuérdese cambiarlo por el string con el nombre del grupo
    }
    
}
