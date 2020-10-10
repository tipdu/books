package fr.caubin.books.author;

import java.util.Date;

public class Author {
    String name;
    String surname;
    String bio;
    Date   birthDate;
    Date   deathDate;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.bio = null;
        this.birthDate = null;
        this.deathDate = null;
    }

    public Author() {
        this.name = null;
        this.surname = null;
        this.bio = null;
        this.birthDate = null;
        this.deathDate = null;
    }

    public Author(String name, String surname, String bio, Date birthDate, Date deathDate) {
        this.name = name;
        this.surname = surname;
        this.bio = bio;
        this.birthDate = birthDate;
        this.deathDate = deathDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }
}
