package baseball;

import baseball.view.InputView;
import java.io.ByteArrayInputStream;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputViewTest {


    @Test
    void 사용자숫자입력테스트(){
        ByteArrayInputStream fakeInput = new ByteArrayInputStream("123".getBytes());
        System.setIn(fakeInput);
        InputView inputView = new InputView();
        String userNumber = inputView.readUserNumber();
        Assertions.assertEquals(3,userNumber.length());
    }

}
