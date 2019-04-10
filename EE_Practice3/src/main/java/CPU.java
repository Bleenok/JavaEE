import org.springframework.stereotype.Component;

@Component
public class CPU {
    String name;
    Integer cores;

    public CPU(String name, Integer cores) {
        this.name = name;
        this.cores = cores;
    }

    public String cpuInfo() {
        return "Name: " + name + " ; Cores: " + cores;
    }
}