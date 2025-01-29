import java.util.Scanner;

public class ScriptChoice extends Script {
    String[] walking = new String[] {
            line,
            "\t✦ 추운 날이니까 거리는 한산하겠지!",
            "\t  당신은 걸어가기로 결정했습니다.\n",
    };

    int inputRoute() {
        Scanner sc = new Scanner(System.in);
        int tmp = 0;
        do {
            System.out.print("\t- 번호를 선택해 주세요(숫자만 입력): ");
            tmp = sc.nextInt();
            System.out.println();
        } while (tmp != 1 && tmp != 2);
        return tmp;
    }
}