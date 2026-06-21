package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] authGrades = AuthGrade.values();

        for(AuthGrade authGrade : authGrades){
            printGrade(authGrade);
        }
    }

    public static void printGrade(AuthGrade authGrade){
        System.out.println("Grade = "+authGrade.name() + ", level = "+authGrade.getLevel()+", 설명 = "+authGrade.getDiscription());
    }
}
