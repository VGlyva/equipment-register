package test.review.equipmentregister.model;

import jakarta.persistence.Entity;
import test.review.equipmentregister.entity.Technique;

import java.util.Objects;

@Entity
public class VacuumCleaner extends Technique {
    private Double dustContainerVolume;
    private Integer numberOfModes;

    public VacuumCleaner() {
    }

    public Double getDustContainerVolume() {
        return dustContainerVolume;
    }

    public void setDustContainerVolume(Double dustContainerVolume) {
        this.dustContainerVolume = dustContainerVolume;
    }

    public Integer getNumberOfModes() {
        return numberOfModes;
    }

    public void setNumberOfModes(Integer numberOfModes) {
        this.numberOfModes = numberOfModes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Objects.equals(dustContainerVolume, that.dustContainerVolume) && Objects.equals(numberOfModes, that.numberOfModes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), dustContainerVolume, numberOfModes);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" +
                "dustContainerVolume=" + dustContainerVolume +
                ", numberOfModes=" + numberOfModes +
                '}';
    }
}
