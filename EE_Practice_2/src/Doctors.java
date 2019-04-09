public class Doctors {
    private User doctor;
    private String name;
    private Integer id;
    private String info;
    private boolean isFree;

    public Doctors(User doctor, String name, Integer id, String info, boolean isFree) {
        this.doctor = doctor;
        this.name = name;
        this.id = id;
        this.info = info;
        this.isFree = isFree;
    }

    public User getDoctor() {
        return doctor;
    }

    public void setDoctor(User doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }


    public boolean isFree() {
        return isFree;
    }

    public String toString() {
        return info;
    }
}