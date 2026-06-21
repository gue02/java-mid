package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요: [GUEST, LOGIN, ADMIN] : ");
        String inputGrade = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(inputGrade);
        showMenu(grade);
    }

    public static void printGrade(AuthGrade authGrade){
        System.out.println("당신의 등급은 "+authGrade.getDiscription()+"입니다.");
    }
    public static void showMenu(AuthGrade grade){
        System.out.println("==메뉴 목록==");
        printGrade(grade);
        if (grade.getLevel() > 0){
            System.out.println("- 메인 화면");
        }if (grade.getLevel() > 1){
            System.out.println("- 이메일 관리 화면");
        }if (grade.getLevel() > 2){
            System.out.println("- 관리자 화면");
        }

    }
}
