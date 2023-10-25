package baseball;

import baseball.model.Computer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerTest {



    @Test

    void testValidComputerNumber(){
        testRandomComputerNumberInRange();
        testRandomComputerNumberInSize();
    }

    @Test
    void testRandomComputerNumberInSize(){
        Computer computer = new Computer();
        List<Integer> computerNumber = computer.generateRandomComputerNumber();
        Assertions.assertEquals(3,computerNumber.size());
    }

    @Test
    void testRandomComputerNumberInRange(){
        Computer computer = new Computer();
        List<Integer> computerNumber = computer.generateRandomComputerNumber();
        for(Integer num: computerNumber){
            Assertions.assertTrue(num>=1&&num<=9);
        }
    }





}
