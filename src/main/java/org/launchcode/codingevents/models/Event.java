package org.launchcode.codingevents.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;



public class Event {

    private int id;
    private static int nextId = 1; //static counter, belongs to the class

    @NotBlank(message="Name is required")
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String name;

    @Size(max=500, message="Description too long")
    private String description;

    @NotBlank(message="Email address required")
    @Email(message="Invalid Email Address. Please try again!")
    private String contactEmail;


    public Event(String name, String description, String contactEmail) {
        this();
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
    }

//no arg constructor, required to use th:field in create.html
    public Event() {
        this.id = nextId;
        nextId++;
        //setting id to 1 and then incrementing allows each id to be unique by +1
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public int getId() {
        return id;
    }
    //don't create setter, we don't want anyone to be able to set id


    @Override
    public String toString() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return getId() == event.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
