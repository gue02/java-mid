package exception.ex4;

public class NetworkServiceV4 {
    public void sendMessage(String data){
        String address = "https://example.com";

        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data);

        try{
            client.connect();
            client.send(data);
        } catch (SendExceptionV4 e) {
            throw new RuntimeException(e);
        } catch (ConnectExceptionV4 e) {
            throw new RuntimeException(e);
        } finally {
            client.disconnect();
        }
    }
}
