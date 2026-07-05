package exception.pro;

public class GameStartupService {
    private DatabaseClient dbClient = new DatabaseClient();
    private AntiCheatClient antiCheatClient = new AntiCheatClient();
    private NetworkClient networkClient = new NetworkClient();

    public void startGame(String input){
        System.out.println("로그인 및 게임 시작 프로세스 진행..");

        dbClient.loadPlayerData(input);
        antiCheatClient.verifyGameFiles(input);
        networkClient.connectToServer(input);

        System.out.println("[게임 실행] 환영합니다, 방랑자님!");
    }
}
