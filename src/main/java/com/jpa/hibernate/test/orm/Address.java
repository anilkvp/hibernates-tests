package com.jpa.hibernate.test.orm;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    private long id;

    @Column
    private String address1;

    @Column
    private String address2;

    @Column
    private String city;

    @Column
    private String state;

    @Column
    private String country;

    @Column
    private String postalCode;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[ Id :").append(this.id);
        builder.append(" /address1 :").append(this.address1);
        builder.append(" /address2 :").append(this.address2);
        builder.append(" /city :").append(this.city);
        builder.append(" /state :").append(this.state);
        builder.append(" /country :").append(this.country);
        builder.append(" /postalCode :").append(this.postalCode);
        builder.append(" /user :").append(this.user.toString()).append(" ]");
        return builder.toString();
    }
}
