/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionandenumsminihw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jnr85
 */
public class CollectionAndEnumsMiniHw {
    
        public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        List<Team> teams = new ArrayList<>();
        Random random = new Random();

        // Step 1: Read data from the text file and load into memory
        try (BufferedReader reader = new BufferedReader(new FileReader("MOCK_DATA.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                String email = parts[3];
                people.add(new Person(id, firstName, lastName, email));
            }
        } catch (IOException e) {
            System.err.println("Error reading the file.");
            e.printStackTrace();
            return;
        }

        // Step 2: Create 20 teams of 5 people each
        for (int i = 1; i <= 20; i++) {
            Team team = new Team("Team " + i);
            while (team.members.size() < 5 && !people.isEmpty()) {
                int randomIndex = random.nextInt(people.size());
                Person person = people.remove(randomIndex);
                team.addMember(person);
            }
            teams.add(team);
        }

        // Step 3: Print each team and its members
        for (Team team : teams) {
            team.printTeam();
        }
    }
        
    }
    

