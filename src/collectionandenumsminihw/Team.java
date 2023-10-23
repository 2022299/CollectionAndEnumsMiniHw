/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collectionandenumsminihw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jnr85
 */
public class Team {
    String name;
    List<Person> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void printTeam() {
        System.out.println("Team Name: " + name);
        System.out.println("Members:");
        for (Person person : members) {
            System.out.println(person);
        }
        System.out.println();
    }
}
