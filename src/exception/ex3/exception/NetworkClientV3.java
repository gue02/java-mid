package exception.ex3.exception;

import exception.ex3.exception.*;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address){
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3 {
        if (connectError){
            throw new ConnectExceptionV3(address, address + " 서버에 연결 실패.");
        }
        System.out.println(address + " Server Connect Complete");
    }

    public void send(String data) throws SendExceptionV3{
        if (sendError){
            //throw new RuntimeException("ex");
            throw new SendExceptionV3(data,address+" 서버에 데이터 전송 실패.");
        }
        System.out.println(address + " Server Data transit: "+ data);
    }

    public void disconnect(){
        System.out.println(address + " Server Disconnect Complete");
    }

    public void initError(String data){
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError = true;
        }
    }
}
