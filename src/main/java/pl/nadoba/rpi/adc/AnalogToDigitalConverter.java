package pl.nadoba.rpi.adc;

import com.pi4j.gpio.extension.mcp.MCP3008GpioProvider;
import com.pi4j.gpio.extension.mcp.MCP3008Pin;
import com.pi4j.io.gpio.*;
import com.pi4j.io.spi.SpiChannel;

import java.io.IOException;

public class AnalogToDigitalConverter {

    private final static int CHECK_DURATION = 2500;

    private final GpioController gpio = GpioFactory.getInstance();

    private MCP3008GpioProvider mcp3008 = null;

    public AnalogToDigitalConverter() {
        try {
            mcp3008 = new MCP3008GpioProvider(SpiChannel.CS0);
        } catch (IOException e) {
            e.printStackTrace();
        }
        init();
    }

    private void init() {
    }

    public void loop() throws InterruptedException {
        for (; ; ) {
            System.out.println("MCP3008 CH0: " + getPinValuePercentage(MCP3008Pin.CH0));

            Thread.sleep(CHECK_DURATION);
        }
    }

    private String getPinValuePercentage(Pin pin) {
        double d = mcp3008.getValue(pin);
        return OutputNormalizer.toPercent(d);
    }

}
