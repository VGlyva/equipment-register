package test.review.equipmentregister.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Technique {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private String color;
    @Column
    private Double size;
    @Column
    private Double price;
    @Column
    private boolean availability;
    @Column
    private String country;
    @Column
    private String brand;
    @Column
    private boolean order;
    @Column
    private boolean credit;

    public Technique() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOrder() {
        return order;
    }

    public void setOrder(boolean order) {
        this.order = order;
    }

    public boolean isCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technique technique = (Technique) o;
        return availability == technique.availability && order == technique.order && credit == technique.credit && Objects.equals(id, technique.id) && Objects.equals(name, technique.name) && Objects.equals(color, technique.color) && Objects.equals(size, technique.size) && Objects.equals(price, technique.price) && Objects.equals(country, technique.country) && Objects.equals(brand, technique.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, size, price, availability, country, brand, order, credit);
    }

    @Override
    public String toString() {
        return "Technique{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", availability=" + availability +
                ", country='" + country + '\'' +
                ", brand='" + brand + '\'' +
                ", order=" + order +
                ", credit=" + credit +
                '}';
    }
}
