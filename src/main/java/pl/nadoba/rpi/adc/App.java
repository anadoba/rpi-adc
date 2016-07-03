package pl.nadoba.rpi.adc;

public class App {


    public static void main(String[] args) throws InterruptedException {

        AnalogToDigitalConv adc = new AnalogToDigitalConv();
        adc.loop();
    }

}
