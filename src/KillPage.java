public class KillPage {
    public static boolean killed = false;
    private enum yeet {
        Mal,Ban,Mac,Fle;
    }

    private static yeet weet = yeet.Mal;

    public static boolean run(char key, Map map) {
        if(key == 'w') {
            switch (weet) {
                case Ban:
                    weet = yeet.Mal;
                    break;
                case Mac:
                    weet = yeet.Ban;
                    break;
                case Fle:
                    weet = yeet.Mac;
                    break;
            }
        } else if(key == 's') {
            switch (weet) {
                case Mal:
                    weet = yeet.Ban;
                    break;
                case Ban:
                    weet = yeet.Mac;
                    break;
                case Mac:
                    weet = yeet.Fle;
                    break;
            }
        } else if(key == 'd') {
            switch(weet){
                case Mal:
                    Map.map[map.MalcolmPath[map.MalProg][1]][map.MalcolmPath[map.MalProg][0]] = 0;
                    map.MalProg = 0;
                    map.MalcolmPath = new int[][] {{1,1}};
                    break;
                case Ban:
                    Map.map[map.BanquoPath[map.BanProg][1]][map.BanquoPath[map.BanProg][0]] = 0;
                    map.BanProg = 0;
                    map.BanquoPath = new int[][] {{1,1}};
                    break;
                case Mac:
                    Map.map[map.MacduffPath[map.MacProg][1]][map.MacduffPath[map.MacProg][0]] = 0;
                    map.MacProg = 0;
                    map.MacduffPath = new int[][] {{1,1}};
                    break;
            }
            killed = true;
            return true;
        } else if(key == 'a') {
            return true;
        }
        FATASS.killPage(weet.toString());
        return false;
    }
}
