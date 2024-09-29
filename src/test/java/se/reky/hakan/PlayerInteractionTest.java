package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {


    private PlayerInteraction playerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);

    }

    @Test
    public void setNameTest(){
        Player player = new Player();
        PlayerInteraction playerInteraction = playerInteraction("Benny");
        playerInteraction.setupPlayer(player);
        Assertions.assertEquals(player.getName(), "Benny" );

    }

    @Test
    public void updateHealthTest(){
        Player player = new Player();
        PlayerInteraction playerInteraction = playerInteraction("Benny");
        playerInteraction.setupPlayer(player);

        int currentHP = player.getHp() + 1;

        playerInteraction.updatePlayerHealth(player, 1);

        Assertions.assertEquals(player.getHp(), currentHP);

    }
}
