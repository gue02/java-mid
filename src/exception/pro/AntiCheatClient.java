package exception.pro;

public class AntiCheatClient {
    public void verifyGameFiles(String input){
        if(input.equals("cheat_error")){
            throw new AntiCheatException("비정상적인 프로그램이 감지되었습니다.");
        }
        System.out.println("무결성 검증 완료.");
    }
}
