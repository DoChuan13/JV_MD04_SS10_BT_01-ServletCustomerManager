package customer.model;

import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private LocalDate dateOfBirth;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(int id, String name, LocalDate dateOfBirth, String address, String image) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.image = image;
    }

    public int getId() {
        return id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Customer{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               ", address='" + address + '\'' +
               ", image='" + image + '\'' +
               '}';
    }
}
