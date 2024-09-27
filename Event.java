package TreeSet;


import java.util.TreeSet;
import java.util.*;

public class Event implements Comparable<Event>{
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public double getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(double timeStamp) {
        this.timeStamp = timeStamp;
    }

    private String eventName;
    private String eventType;
    private double timeStamp;

    public Event(String eventName,String eventType, double timeStamp) {
        this.eventName = eventName;
        this.eventType = eventType;
        this.timeStamp = timeStamp;
    }


    @Override
    public int compareTo(Event o) {
        return Double.compare(this.timeStamp,o.timeStamp);
    }



    public static void main(String[] args){

        TreeSet<Event> treeEvent = new TreeSet<Event>();

        treeEvent.add(new Event("first","open request",1L));
        treeEvent.add(new Event("second","stay request",4L));
        treeEvent.add(new Event("third","close request",3L));

        treeEvent.forEach(System.out::println);

    }


    @Override
    public String toString() {
        return "Event{" +
                "eventName='" + eventName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", timeStamp=" + timeStamp +
                '}';
    }
}
