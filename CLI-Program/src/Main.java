public class Main {
    public static void main(String[] args) {
        Walk walk = new Walk(16, 0);
        Route[] route = new Route[3];
        route[0] = new Route(7, 1450, "375", "판교역서편", "메디포스트 정류장");
        route[1] = new Route(10, 1450, "누리4", "판교역북편", "금토천교 정류장");
        route[2] = new Route(12, 1350, "66", "판교역서편", "엔씨소프트.안랩 정류장");

        ScriptOpening so = new ScriptOpening();
        ScriptChoice sc = new ScriptChoice();
        ScriptBus sb = new ScriptBus();
        ScriptEnding se = new ScriptEnding();

        // 오프닝 문구 출력
        typing(so.opening);

        // 1.걸어갈 것인가, 2.버스를 탈 것인가?
        int tmp = sc.inputRoute();

        if (tmp == 1) {
            // 1. 걸어간다.
            typing(sc.walking);
            tmp = 0;
        }
        else if (tmp == 2) {
            // 2. 버스를 탄다.
            tmp = sb.takeBus(route);
        }

        // 결정 결과 출력
        se.ending(walk, route, tmp);
    }

    public static void typing(String[] text) {
        // 타이핑 효과: 한 줄씩 시간 텀을 두고 끊어서 출력한다.
        try {
            for (int i=0; i<text.length; i++) {
                System.out.println(text[i]);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}