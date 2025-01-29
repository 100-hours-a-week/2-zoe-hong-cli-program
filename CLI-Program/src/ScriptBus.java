import java.util.Scanner;

public class ScriptBus extends Script {
    String[] bustext1 = new String[] {
            line,
            "\t✦ 길을 잃어버릴 일은 없을 거야.",
            "\t  당신은 버스를 타기로 결정했습니다.\n"
    };

    String[] bustext2 = new String[]{
            line,
            "\t✦ 유스케이스 건물까지 가는 버스는 많습니다.\n"
    };

    int takeBus(Route[] route) {
        int bus;

        Main.typing(bustext1);

        // 버스 1.검색 및 2.결정
        do {
            Main.typing(bustext2);
            busType(route);
            bus = inputBusType();
            busInfo(route[bus - 1]);
        } while (inputBusInfo() != 2);

        return bus;
    }

    void busType(Route[] route) {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = "\t  " + (i + 1) + ". " + route[i].isBus();
        }
        Main.typing(str);
    }

    int inputBusType() {
        Scanner sc = new Scanner(System.in);
        int bus;
        do {
            System.out.print("\t- 번호를 입력하여 버스 정보를 확인하세요.\n\t  (숫자만 입력): ");
            bus = sc.nextInt();
            System.out.println();
        } while (bus != 1 && bus != 2 && bus != 3);

        return bus;
    }

    void busInfo(Route route) {
        String[] info = new String[8];
        info[0] = line;
        info[1] = "\t✦ " + route.isBus() + "\n";
        info[2] = "\t  " + route.isDuration();
        info[3] = "\t  " + route.isCharge();
        info[4] = "\t  " + route.isRideStop();
        info[5] = "\t  " + route.isDropStop() + "\n";
        info[6] = "\t  1. 이전 질문으로 돌아간다.";
        info[7] = "\t  2. 이 버스를 탈 것이다.";

        Main.typing(info);
    }

    int inputBusInfo() {
        Scanner sc = new Scanner(System.in);
        int tmp;
        do {
            System.out.print("\t- 번호를 선택해 주세요(숫자만 입력): ");
            tmp = sc.nextInt();
            System.out.println();
        } while (tmp != 1 && tmp != 2);
        return tmp;
    }
}