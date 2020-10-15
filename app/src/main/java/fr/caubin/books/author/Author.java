package fr.caubin.books.author;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class Author {
    String name = StringUtils.EMPTY;
    String bio = StringUtils.EMPTY;
    Date   birthDate = null;
    Date   deathDate = null;

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
