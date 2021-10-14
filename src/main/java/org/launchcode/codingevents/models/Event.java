package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;


@Entity
public class Event extends AbstractEntity {


    @NotBlank(message="Name is required")
    @Size(min=3, max=50, message="Name must be between 3 and 50 characters")
    private String name;

    @Size(max=500, message="Description too long")
    private String description;

    @NotBlank(message="Email address required")
    @Email(message="Invalid Email Address. Please try again!")
    private String contactEmail;


    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

//no arg constructor, required for ORM for an entity class
    public Event() {
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

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

    //don't create setter, we don't want anyone to be able to set id


    @Override
    public String toString() {
        return name;
    }

}
