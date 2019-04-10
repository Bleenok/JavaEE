import org.springframework.stereotype.Component;

@Component
public class Screen {
    String name, resolution;

    Screen(String name, String resolution) {
        this.name = name;
        this.resolution = resolution;
    }

    public String screenInfo() {
        return "Screen: " + name + " Resolution: " + resolution;
    }
}