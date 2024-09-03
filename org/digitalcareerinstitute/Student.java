package org.digitalcareerinstitute;

public record Student(String name) {

    public Student(String name) {
        this.name = name.trim();
    }

}
