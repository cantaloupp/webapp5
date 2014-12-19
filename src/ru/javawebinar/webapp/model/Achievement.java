package ru.javawebinar.webapp.model;

import java.util.ArrayList;
import java.util.List;

/**
 * mnikanor
 * 17.12.2014.
 */

public class Achievement extends Resume {
    public Achievement() {
        List<Achievement> achievements = new ArrayList<Achievement>();
        for (Achievement achievement : achievements) {
            System.out.println("Achievements:" + achievement);
        }
    }

}