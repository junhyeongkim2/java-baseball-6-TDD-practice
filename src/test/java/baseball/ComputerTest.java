package baseball;

import baseball.model.Computer;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerTest {


    @Test
    void 랜덤숫자생성테스트(){
        Computer computer = new Computer();
        List<Integer> computerNumber = computer.randomComputerNumber();
        Assertions.assertEquals(3,computerNumber.size());


    }


}
