package com.projectmt.machine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jeferson
 */
@Entity
@Table(name="machine")
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name="brand", nullable = false, length = 45)
    private String brand;
    @Column(name="year", nullable = false)
    private long year;
    @Column(name="category", nullable = false)
    private long category;
    @Column(name="name", nullable = false, length = 45)
    private String name;
    @Column(name="description", nullable = false, length = 250)
    private String description;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the year
     */
    public long getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(long year) {
        this.year = year;
    }

    /**
     * @return the category
     */
    public long getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(long category) {
        this.category = category;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

}