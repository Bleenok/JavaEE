import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class G580 {
    @Autowired
    @Qualifier("decent")
    Battery battery;

    @Autowired
    @Qualifier("4k")
    Screen screen;

    @Autowired
    @Qualifier("Intel")
    CPU cpu;

    String name;

    public G580(String name) {
        this.name = name;
    }

    public String getInfo() {
        return "Name: " + name + " \n" + battery.batteryInfo() + screen.screenInfo() + cpu.cpuInfo();
    }
}