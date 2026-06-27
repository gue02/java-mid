package exception.ex1;

public class NetworkClientV1_1 {
    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV1_1(String address){
        this.address = address;
    }

    public String connect(){
        if (connectError){
            System.out.println(address + " Server Connect Failure");
            return "connectError";
        }
        System.out.println(address + " Server Connect Complete");
        return "success";
    }

    public String send(String data){
        if (sendError){
            System.out.println(address + " Server Data transit Failure : "+data);
            return "sendError";
        }
        System.out.println(address + " Server Data transit: "+ data);
        return "success";
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
