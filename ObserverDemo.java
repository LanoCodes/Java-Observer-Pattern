//Delano Powell

//This is the client class
public class ObserverDemo {

    public static void main(String[] args) {
        SensorSystem sensorSystem = new SensorSystem();

        sensorSystem.register(new Gates());
        sensorSystem.register(new Lighting());
        sensorSystem.register(new Surveillance());

        sensorSystem.soundTheAlarm();
    }

}
