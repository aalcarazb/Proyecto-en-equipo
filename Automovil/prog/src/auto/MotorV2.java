package auto;

public class MotorV2 extends Motor { // Extensión de la clase Motor

    
    public MotorV2(float consumo_100_km, Automovil coche) {
        super(consumo_100_km, coche); // invocación al constructor de Motor
        version = "2.0";  // Modificación de la variable version
        autor = "APLICUSA";  // Recuérdese sustituir la expresión <GRUPO_DE_PRACTICAS> por el string correspondiente al grupo
    }
    

    @Override
    protected void transitarRPM(float rpm_def) { // Sobrescritura de transitarRPM de Motor

        Log.i("transitando en aceleración");

        preparacionTransicion();

        final float incremento = (rpm_def - getRPM()) / getPASOS();

        for (int i = 0; i < getPASOS(); i++) {

            setRPM(getRPM()+incremento);

            if (romperBucle()) break;  // aquí también se controla el tiempo que conlleva la ejecución de un paso o iteración

        } // for

        Log.i("fin transición aceleración");

    } // transitarRPM

} // MotorV2
