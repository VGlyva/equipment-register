package test.review.equipmentregister.model;

import jakarta.persistence.Entity;
import test.review.equipmentregister.entity.Technique;

import java.util.Objects;

@Entity
public class TV extends Technique {
    private String category;
    private String technology;

    public TV() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return Objects.equals(category, tv.category) && Objects.equals(technology, tv.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), category, technology);
    }

    @Override
    public String toString() {
        return "TV{" +
                "category='" + category + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}
