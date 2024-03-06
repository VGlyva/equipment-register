package test.review.equipmentregister.model;

import jakarta.persistence.Entity;
import test.review.equipmentregister.entity.Technique;

import java.util.Objects;

@Entity
public class Fridge extends Technique {
    private Integer numberOfDoors;
    private String compressorType;

    public Fridge() {
    }

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return Objects.equals(numberOfDoors, fridge.numberOfDoors) && Objects.equals(compressorType, fridge.compressorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfDoors, compressorType);
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "numberOfDoors=" + numberOfDoors +
                ", compressorType='" + compressorType + '\'' +
                '}';
    }
}
