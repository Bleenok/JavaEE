import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class K10 {
    @Autowired
    @Qualifier("large")
    Battery battery;

    @Autowired
    @Qualifier("2k")
    Display display;

    @Autowired
    @Qualifier("AMD")
    GPU cpu;

    String name;

    public K10(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + name + "\n" +battery.batteryInfo() + screen.screenInfo() + cpu.cpuInfo();

    }
}