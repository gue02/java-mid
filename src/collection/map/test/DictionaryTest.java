package collection.map.test;

import java.util.*;

public class DictionaryTest {
    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("==단어 입력 단계==");
        while (true){
            String english, korean;
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            english = scanner.nextLine();
            if (english.equals("q"))
                break;
            System.out.print("한글 뜻을 입력하세요: ");
            korean = scanner.nextLine();

            dictionary.put(english,korean);
        }

        System.out.println("==단어 검색 단계==");
        while (true){
            String english;
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            english = scanner.nextLine();
            if (english.equals("q"))
                break;
            else if (dictionary.containsKey(english)) {
                System.out.println(english+"의 뜻: "+dictionary.get(english));
            } else{
                System.out.println(english+"은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
