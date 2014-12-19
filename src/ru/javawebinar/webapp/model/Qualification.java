package ru.javawebinar.webapp.model;

/**
 * mnikanor
 * 17.12.2014.
 */
public class Qualification extends Resume {
     public Qualification() {
        for (Qualification qualification : qualifications) {
            System.out.println("Qualification:" + qualification);
        }
     }
}