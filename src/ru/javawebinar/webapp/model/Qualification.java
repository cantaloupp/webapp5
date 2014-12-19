package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * mnikanor
 * 17.12.2014.
 */
public class Qualification extends Resume {
     public Qualification() {
        List<Qualification> qualifications = new ArrayList<Qualification>();
        for (Qualification qualification : qualifications) {
            System.out.println("Qualification:" + qualification);
        }
     }
}