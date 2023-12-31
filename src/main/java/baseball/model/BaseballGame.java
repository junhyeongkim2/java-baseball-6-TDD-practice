package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {

    List<Integer> userNumber;
    List<Integer> computerNumber;
    public void startGame() {
    }

    public List<Integer> changeUserNumberToList(String userNumber) {
        this.userNumber = new ArrayList<Integer>();
        for(int i = 0 ; i < userNumber.length(); i++){
            this.userNumber.add(userNumber.charAt(i)-'0');
        }
        return this.userNumber;
    }


    public List<Integer> createComputerNumber() {
        Computer computer = new Computer();
        this.computerNumber = new ArrayList<>();
        this.computerNumber = computer.generateRandomComputerNumber();
        return this.computerNumber;
    }

    public int[] compareTwoNumbers() {
        int[] results = new int[2];
        for(int i = 0 ; i < userNumber.size();i++){
            if(userNumber.get(i)==computerNumber.get(i)){
                results[0]++;
            }
            if(computerNumber.contains(userNumber.get(i))){
                results[1]++;
            }
        }
        return results;
    }






}



