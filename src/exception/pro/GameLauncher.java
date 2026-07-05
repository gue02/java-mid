package exception.pro;
import java.util.Scanner;

public class GameLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GameStartupService gameService = new GameStartupService();

        System.out.println("=== 레전드 오브 자바 (게임 런처) ===");
        System.out.println("정상 실행하려면 아무 글자나 입력하세요.");
        System.out.println("에러 발생 명령어: db_error, cheat_error, net_error / 종료: exit");

        while (true){
            System.out.println("\n 명렁어 입력: ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("런처를 종료합니다.");
                break;
            }

            try{
                gameService.startGame(input);
            }catch (Exception e){
                exceptionHandler(e);
            }
        }
    }

    private static void exceptionHandler(Exception e){
        System.out.println("\n🚨 [클라이언트(유저) 안내 메시지]");

        if(e instanceof GameSystemException){
            System.out.println("게임 실행 중 시스템 오류가 발생했습니다. 잠시 후 다시 시도해주세요.");
            if (e instanceof AntiCheatException){
                System.out.println("경고: 불법 프로그램 사용은 계정 정지의 원인이 됩니다.");
            }
        } else {
            System.out.println("알 수 없는 치명적인 오류가 발생하였습니다.");
        }
        System.out.println("\n🛠️ [개발자용 디버깅 로그]");
        e.printStackTrace(System.out);
    }
}
