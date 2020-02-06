package edu.touro.mco264;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GematriaTest {

    Gematria temp = new Gematria();

    @Test
    void compare(){
        //Arrange
        List<String> list = new ArrayList<>();
        String abba = "abba";
        String zyz = "ZYZ ";
        list.add(abba);list.add(zyz);

        //Act
        list.sort(new Gematria());
        assertEquals(abba, list.get(0));
    }


    @Test
    void sort(){
        String[] sortedList = {"cease", "zinc", "nose", "shave", "tent", "bury",
                                "retain", "remove", "mellow", "befitting", "determine",
                                "typeset", "toothsome"};

        String[] listBeingSorted = {"typeset", "retain", "mellow", "toothsome", "nose",
                                    "remove", "shave", "cease", "befitting", "determine",
                                    "tent", "bury", "zinc"};

        temp.sort(listBeingSorted);

        for(int i = 0; i < listBeingSorted.length; i++){
            assertEquals(sortedList[i], listBeingSorted[i]);
        }
    }
}
