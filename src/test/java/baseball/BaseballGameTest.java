package baseball;

import baseball.model.BaseballGame;
import baseball.model.Computer;
import baseball.model.User;
import baseball.view.InputView;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.util.List;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BaseballGameTest {


    void 게임시작테스트(){
        BaseballGame baseballGame = new BaseballGame();
        baseballGame.startGame();
    }

    @Test
    void 유저입력리스트변환테스트(){
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("123".getBytes());
        System.setIn(fakeInput);
        BaseballGame baseballGame = new BaseballGame();
        InputView inputView = new InputView();

        String input = inputView.readUserNumber();
        List<Integer> userNumber = baseballGame.changeUserNumberToList(input);

        Assertions.assertEquals(userNumber.size(),input.length());
    }


    @Test
    void 컴퓨터넘버생성테스트(){
        BaseballGame baseballGame = new BaseballGame();
        List<Integer>computerNumber = baseballGame.createComputerNumber();

        Assertions.assertEquals(3,computerNumber.size());
        for(int number : computerNumber){
            Assertions.assertTrue(number>=1&&number<=9);
        }

    }

    @Test
    void 공상태판별테스트(){
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("123".getBytes());
        System.setIn(fakeInput);

        BaseballGame baseballGame = new BaseballGame();
        InputView inputView = new InputView();

        baseballGame.createComputerNumber();
        String input = inputView.readUserNumber();
        baseballGame.changeUserNumberToList(input);

        int [] results = baseballGame.compareTwoNumbers();

        Assertions.assertEquals(2,results.length);
        Assertions.assertTrue(results[0]<=3);
        Assertions.assertTrue(results[1]<=3);
        Assertions.assertTrue(Integer.class.isInstance(results[0]));
        Assertions.assertTrue(Integer.class.isInstance(results[1]));


    }









}
