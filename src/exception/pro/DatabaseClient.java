package exception.pro;

public class DatabaseClient {
    public void loadPlayerData(String input){
        if(input.equals("db_error")){
            throw new DatabaseException("세이브 파일 데이터 손상.(DB_CODE: 9981)");
        }
        System.out.println("세이브 데이터를 성공적으로 불러왔습니다.");
    }
}
