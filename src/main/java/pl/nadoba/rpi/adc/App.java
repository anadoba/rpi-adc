package pl.nadoba.rpi.adc;

public class App {


    public static void main(String[] args) throws InterruptedException {

        AnalogToDigitalConverter adc = new AnalogToDigitalConverter();
        adc.loop();
    }

}
