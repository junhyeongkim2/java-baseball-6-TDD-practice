package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    List<Integer> userNumber;
    public void startGame() {
    }


    public List<Integer> changeUserNumberToList(String userNumber) {
        this.userNumber = new ArrayList<Integer>();
        for(int i = 0 ; i < userNumber.length(); i++){
            this.userNumber.add(userNumber.charAt(i)-'0');
        }
        return this.userNumber;
    }


}



