package chapter8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("필터를 통해서 커피를 우려내는 중");
    }

    @Override
    void addCondiments() {
        System.out.println("설탕과 우유를 추가하는 중");
    }

    @Override
    boolean customerWantsCondiments() {
        String  answer = getUserInput();
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("커피에 우유와 설탕을 넣어드릴까요? (y/n) ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = br.readLine();
        } catch (IOException e) {
            System.err.println("IO 오류");
        }
        if(answer == null) {
            return "no";
        }
        return answer;
    }

}
