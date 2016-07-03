package pl.nadoba.rpi.adc;

public class OutputNormalizer {

    public static String toPercent(double d) {
        double percent = (d / 1023) * 100;
        return String.format("%.1f%", d);
    }
}
