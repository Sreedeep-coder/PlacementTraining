interface Sensor {
    double readValue();           
    String getSensorType();       
}
class TemperatureSensor implements Sensor {
    public double readValue() {
        return 25.5; 
    }

    public String getSensorType() {
        return "Temperature Sensor";
    }
}

class MotionSensor implements Sensor {
    public double readValue() {
        return 2.0; 
    }

    public String getSensorType() {
        return "Motion Sensor";
    }
}
public class home {
    public static void main(String[] args) {
        Sensor tempSensor = new TemperatureSensor();
        Sensor motionSensor = new MotionSensor();
        System.out.println(tempSensor.getSensorType() + ": " + tempSensor.readValue() + " °C");
        double motionValue = motionSensor.readValue();
        String motionStatus = (motionValue >= 1.0) ? "Motion Detected" : "No Motion";
        System.out.println(motionSensor.getSensorType() + ": " + motionStatus);
    }
}
