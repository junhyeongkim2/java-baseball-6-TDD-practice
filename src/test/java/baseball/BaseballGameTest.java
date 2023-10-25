package baseball;

import baseball.model.BaseballGame;
import baseball.model.Computer;
import baseball.view.InputView;
import java.io.ByteArrayInputStream;
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









}
