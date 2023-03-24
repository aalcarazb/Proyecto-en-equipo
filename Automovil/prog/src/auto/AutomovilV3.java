package auto;

public class AutomovilV3 extends AutomovilV2 {

    int max_pasajeros;  // NUEVA PROPIEDAD EN AutomovilV3 respecto a sus ancestros

    // En el constructor tenemos presente su valor impuesto en la creación del objeto Automovil3: int max_pasajeros
    public AutomovilV3(String modelo, float capacidad_deposito, float consumo_100_km, float tara, int n_marchas, int puerto_servidor_telemetria, int puerto_servidor_telecontrol, int max_pasajeros) {

        super(modelo, capacidad_deposito, consumo_100_km, tara, n_marchas, puerto_servidor_telemetria, puerto_servidor_telecontrol);
        
        this.max_pasajeros = max_pasajeros;  // guardamos el parámetro del constructor max_pasajeros en el atributo max_pasajeros de AutomovilV3
        
        version = "3.0"; // Nueva versión
        //autor = "APLICUSA"; // Recuérdese cambiarlo por el string con el nombre del grupo
    }

    @Override
    protected void setPasajeros(int pasajeros) {       

        int pasajeros_definitivos = pasajeros;
        
        // Si pasajeros es negativo o superior al máximo (max_pasajeros), entonces pasajeros_definitivos se reajustara a 1 pasajero
        if (pasajeros < 0 || pasajeros > max_pasajeros) pasajeros_definitivos = 1;
        // ...  y al final:
        super.setPasajeros(pasajeros_definitivos); // asignación directa de pasajeros_definitivos 
                                                   // a la variable de Automovil que registra el número de pasajeros

    }

}
