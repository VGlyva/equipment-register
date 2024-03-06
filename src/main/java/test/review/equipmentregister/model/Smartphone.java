package test.review.equipmentregister.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import test.review.equipmentregister.entity.Technique;

import java.util.Objects;
@Entity
@Table(name = "smartphone")
public class Smartphone extends Technique {
    @Column
    private Double memory;
    @Column
    private Integer numberOfCameras;

    public Smartphone() {
    }

    public Double getMemory() {
        return memory;
    }

    public void setMemory(Double memory) {
        this.memory = memory;
    }

    public Integer getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(Integer numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(memory, that.memory) && Objects.equals(numberOfCameras, that.numberOfCameras);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory, numberOfCameras);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "memory=" + memory +
                ", numberOfCameras=" + numberOfCameras +
                '}';
    }
}
