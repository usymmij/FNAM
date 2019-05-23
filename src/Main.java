public class Main {
    private static final int timeRange = 1000;
    private static final int cycleCheck = 5;
    private static final int endTime = 50;

    private static int counter = 0;

    public static int music = 0;

    private static Pages currentPage = Pages.INITIAL;
    private static long stepTime;
    private static Map dunsinante;
    public static boolean right = false;
    public static boolean left = false;
    private static boolean started = false;
    private static int weee = 0;
    public static player assholeTrynaPlay;
    private static int banqq = 0;

    public static void main(String[] args){
        MusicThread moo = new MusicThread();
        moo.start();
        dunsinante = new Map();
        assholeTrynaPlay = new player();
        FATASS.setup();
        while(!started){
            System.out.println("stuck in d");}
        stepTime = System.currentTimeMillis();
        System.out.println("Reached a");
        while(true) {
            if (System.currentTimeMillis() - stepTime >= timeRange){
                if(dunsinante.BanquoPath[0][0] == 1 && dunsinante.BanquoPath[0][1] == 1) {
                    if(Math.random() < 0.1) {
                        FATASS.banq();
                        banqq++;
                        music = 1;
                    }
                }
                if(banqq >= 5) {
                    banqq = 0;
                    FATASS.room(right, left);
                    music = 2;
                } else if(banqq > 0) {
                    banqq++;
                }
                stepTime = System.currentTimeMillis();
                weee++;
                if(weee >= cycleCheck) {
                    counter++;
                    while(counter >= endTime) {
                        FATASS.weee();
                    }
                    weee = 0;
                    if(dunsinante.map[7][5] % 2 == 1 && !right || dunsinante.map[4][5] % 2 == 1 && !left) {
                        while(true) {
                            FATASS.ded();
                        }
                    }
                    dunsinante.move();
                }
                if(right) {
                    assholeTrynaPlay.subtractmyJUICE();
                }
                if(left) {
                    assholeTrynaPlay.subtractmyJUICE();
                }
            }
            FATASS.updateText();
        }
    }

    public static void pressed(char key){
        switch(currentPage) {
            case INITIAL:
                FATASS.room(right, left);
                started = true;
                currentPage = Pages.ROOM;
                break;
            case ROOM:
                if(key == 'w' && assholeTrynaPlay.getmyJUICE() > 0) {
                    //map
                    assholeTrynaPlay.subtractmyJUICE();
                    FATASS.mmmap();
                    currentPage = Pages.MAP;
                } else if (key == 'a' && assholeTrynaPlay.getmyJUICE() > 0) {
                    //leftDoor
                    left = !left;
                    FATASS.room(right, left);
                } else if (key == 's') {
                    //killPage
                    if(!KillPage.killed) {
                        KillPage.run(key, dunsinante);
                        currentPage = Pages.KILLPAGE;
                    }
                } else if (key == 'd' && assholeTrynaPlay.getmyJUICE() > 0) {
                    //rightDoor
                    right = !right;
                    FATASS.room(right, left);
                }
                break;
            case MAP:
                if(key == 'w') {
                    //cam1
                    whichPic(0);
                } else if (key == 'a') {
                    //cam2
                    whichPic(1);
                } else if (key == 's') {
                    //cam3
                    whichPic(2);
                } else if (key == 'd') {
                    //cam4
                    whichPic(3);
                }
                currentPage = Pages.CAM;
                break;
            case CAM:
                FATASS.room(right, left);
                currentPage = Pages.ROOM;
                break;
            case KILLPAGE:
                if(KillPage.run(key,dunsinante)) {
                    FATASS.room(right, left);
                    currentPage = Pages.ROOM;
                }
        }
    }

    private static void whichPic(int cam) {
        if(dunsinante.returnCam()[cam].check()) {
            FATASS.monCam();
        } else {
            FATASS.cam();
        }
    }
}