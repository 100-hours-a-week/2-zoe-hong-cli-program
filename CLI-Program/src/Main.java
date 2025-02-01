import Script.*;
import Transportation.Bus;
import Transportation.Taxi;
import Transportation.Walk;

public class Main {
    public static void main(String[] args) {
        Walk walk = new Walk(16, 0);
        Bus[] bus = new Bus[3];
        bus[0] = new Bus(7, 1450, "375", "판교역서편", "메디포스트 정류장");
        bus[1] = new Bus(10, 1450, "누리4", "판교역북편", "금토천교 정류장");
        bus[2] = new Bus(12, 1350, "66", "판교역서편", "엔씨소프트.안랩 정류장");
        Taxi taxi = new Taxi(4, 5100, "경기65바8065");

        ScriptOpening so = new ScriptOpening();
        ScriptChoice1 sc1 = new ScriptChoice1();
        ScriptChoice2 sc2 = new ScriptChoice2();
        ScriptBus sb = new ScriptBus();
        ScriptEnding se = new ScriptEnding();

        // 오프닝 문구 출력
        so.typingOpening();

        // 1.걸어갈 것인가, 2.대중교통을 탈 것인가?
        switch(sc1.inputWalkOrVehicle()) {
            case 1:
                sc1.typingWalking();
                se.ending(walk);
                break;
            case 2:
                // 1.버스를 탈 것인가, 2.택시를 탈 것인가?
                switch (sc2.inputBusOrTaxi()) {
                    case 1:
                        se.ending(sb.takeBus(bus));
                        break;
                    case 2:
                        sc2.typingTaxi();
                        se.ending(taxi);
                        break;
                }
                break;
        }
    }
}