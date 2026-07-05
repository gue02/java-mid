package exception.pro;

public class NetworkClient {
    public void connectToServer(String input){
        if(input.equals("net_error")){
            throw new NetworkException("Asia 서버와 연결할 수 없습니다.");
        }
        System.out.println("멀티플레이 서버 연결 성공.");
    }
}
