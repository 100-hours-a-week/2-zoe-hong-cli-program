public class ScriptEnding extends Script {
    String[] ending_first = new String[] {
            line,
            letter,
            "               ✦ Ending ✦",
            "      당신은 제시간에 부트캠프에 도착했습니다.",
            "               축하드립니다!\n",
    };
    String[] ending_last = new String[] {
            letter,
            line
    };

    void ending(Walk walk, Vehicle[] route, int bus) {
        Main.typing(ending_first);
        if (bus == 0) {
            System.out.println("\t\t" + walk.isDuration());
            System.out.println("\t\t" + walk.isCharge() + "\n");
        } else {
            System.out.println("\t\t" + route[bus - 1].isDuration());
            System.out.println("\t\t" + route[bus - 1].isCharge() + "\n");
        }
        Main.typing(ending_last);
    }
}
