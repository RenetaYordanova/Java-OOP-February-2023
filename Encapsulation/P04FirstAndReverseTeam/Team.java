package P04FirstAndReverseTeam;

import P03Validation.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person>reserveTeam;

     Team(String name) {
         this.firstTeam = new ArrayList<>();
         this.reserveTeam = new ArrayList<>();

         setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

     void  addPlayer(Person player){
         if (player.getAge ()< 40) {
             this.firstTeam.add(player);
         } else {
             this.reserveTeam.add(player);
         }
     }



    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeam);
    }
}