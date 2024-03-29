import java.util.Scanner;

public class Ch01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("월(1~12)을 입력하시오 : ");
        int month = scanner.nextInt();

        if(3 <= month && month <= 5) {
            System.out.println("봄 입니다.");
        }
        else if(6 <= month && month <= 8) {
            System.out.println("여름 입니다.");
        }
        else if(9 <= month && month <= 11) {
            System.out.println("가을 입니다.");
        }
        else if(month >= 13) {
            System.out.println("다시 입력 해 주세요 ");
        }
        else {
            System.out.println("겨울 입니다.");
        }

    }
}
