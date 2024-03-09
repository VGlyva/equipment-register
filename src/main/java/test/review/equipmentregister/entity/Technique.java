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
    private String typeOfEquipment;
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
    private boolean orderOnline;

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

    public String getTypeOfEquipment() {
        return typeOfEquipment;
    }

    public void setTypeOfEquipment(String typeOfEquipment) {
        this.typeOfEquipment = typeOfEquipment;
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

    public boolean isOrderOnline() {
        return orderOnline;
    }

    public void setOrderOnline(boolean orderOnline) {
        this.orderOnline = orderOnline;
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
        return availability == technique.availability && orderOnline == technique.orderOnline && credit == technique.credit && Objects.equals(id, technique.id) && Objects.equals(name, technique.name) && Objects.equals(typeOfEquipment, technique.typeOfEquipment) && Objects.equals(color, technique.color) && Objects.equals(size, technique.size) && Objects.equals(price, technique.price) && Objects.equals(country, technique.country) && Objects.equals(brand, technique.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, typeOfEquipment, color, size, price, availability, country, brand, orderOnline, credit);
    }

    @Override
    public String toString() {
        return "Technique{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", typeOfEquipment='" + typeOfEquipment + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", availability=" + availability +
                ", country='" + country + '\'' +
                ", brand='" + brand + '\'' +
                ", orderOnline=" + orderOnline +
                ", credit=" + credit +
                '}';
    }
}
