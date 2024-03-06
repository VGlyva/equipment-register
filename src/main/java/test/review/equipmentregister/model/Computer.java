package test.review.equipmentregister.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import test.review.equipmentregister.entity.Technique;

import java.util.Objects;
@Entity
public class Computer extends Technique {
    @Column
    private String category;
    @Column
    private String processorType;

    public Computer() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Computer computer = (Computer) o;
        return Objects.equals(category, computer.category) && Objects.equals(processorType, computer.processorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, processorType);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "category='" + category + '\'' +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
