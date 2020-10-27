//Delano Powell
import java.util.ArrayList;

//This is the publisher class
public class SensorSystem {

    //This ArrayList saves all the observers of this publisher
    ArrayList<AlarmListener> listeners = new ArrayList();

    //This method will add alarmListener to listeners
    void register(AlarmListener alarmListener){
        listeners.add(alarmListener);
    }

    void soundTheAlarm(){

        //test for loop to loop through all the listeners(observers)
//        for (int i = 0; i < listeners.size(); i++){
//            listeners.get(i).alarm();
//        }

        //Actual for loop I wanted to implement
        for(AlarmListener alarmListener: listeners){
            alarmListener.alarm();
        }

    }
}
