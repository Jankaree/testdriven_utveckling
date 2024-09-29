package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorTest {

    Player player1 = new Player("Benny", 50,50);
    Player player2 = new Player("Lenny", 50,50);


    @Test
    public void attackTest(){

        player1.attack(player2);
        Assertions.assertEquals(player2.getHp(),0);
    }
}
