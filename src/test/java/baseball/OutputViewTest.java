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

    @Test
    void 숫자_입력_요청_문구_테스트(){
        System.out.println("숫자 입력 요청 문구 테스트");
        OutputView outputView = new OutputView();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        outputView.printRequestInputMessage();
        String printedMessage = outputStream.toString();
        Assertions.assertEquals("숫자를 입력해주세요 : \n", printedMessage);
        System.out.println(printedMessage);
    }

}
