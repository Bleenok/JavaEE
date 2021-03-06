package data;

import javax.persistence.*;

@Entity
@Table(name="Lectures")
@IdClass(AudID.class)
public class Lecture {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private int id;
    private String name;
    private double credits;
    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "lecturer_fk", nullable = false)
    private Lecturers lecturer;
    public int getId() {
        return id;
    }

    public Lecturers getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturers lecturer) {
        this.lecturer = lecturer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    //Getters and settings
}