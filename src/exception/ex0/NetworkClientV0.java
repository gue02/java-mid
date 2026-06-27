package exception.ex0;

public class NetworkClientV0 {
    private final String address;

    public NetworkClientV0(String address){
        this.address = address;
    }

    public String connect(){
        System.out.println(address + " Server Connect Complete");
        return address;
    }

    public String send(String data){
        System.out.println(address + " Server Data transit: "+ data);
        return "success";
    }

    public void disconnect(){
        System.out.println(address + " Server Disconnect Complete");
    }
}
