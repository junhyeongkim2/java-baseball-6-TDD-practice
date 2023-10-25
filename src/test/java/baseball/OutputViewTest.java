package baseball;

import baseball.view.OutputView;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutputViewTest {


    @Test
    void 시작_문구_출력_테스트(){
        OutputView outputView = new OutputView();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        outputView.printStartMessage();

        String printedMessage = outputStream.toString().trim();

        Assertions.assertEquals("숫자 야구 게임을 시작합니다.",printedMessage);

    }


}
