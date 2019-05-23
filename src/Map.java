public class Map {
    // map is a 9x 7y grid
    // 0 is ignored just cuz i don't have a lot of time and it won't be too complicated anyway
    //from 1,1 to 9, 7
    public static int[][] map = new int[10][8];
    private securityCamera[] pervs;
    //y,x
    public int[][] BanquoPath = {{1,5},{2,5},{2,6},{2,7},{3,7},{4,7},{5,7}};
    public int[][] MalcolmPath = {{1,4},{1,5},{2,5},{2,4},{2,3},{2,2},{3,2},{4,2},
            {4,3},{4,4},{5,4}};
    public int[][] MacduffPath = {{1,7},{1,6},{2,6},{2,7},{2,8},{2,9},{3,9},{4,9},
            {5,9},{6,9},{6,8},{6,7},{5,7}};
    public int BanProg = 0;
    public int MalProg = 0;
    public int MacProg = 0;

    public securityCamera[] returnCam(){
        return pervs;
    }

    public void move() {
        moveBanquo();
        moveMalcolm();
        moveMacduff();
    }

    private void moveBanquo() {
        if(BanProg >= BanquoPath.length - 1) {
            return;
        }
        map[BanquoPath[BanProg][1]][BanquoPath[BanProg][0]] = 0;
        BanProg++;
        map[BanquoPath[BanProg][1]][BanquoPath[BanProg][0]] = 4;
    }

    private void moveMalcolm() {
        if(MalProg >= MalcolmPath.length - 1){
            return;
        }
        map[MalcolmPath[MalProg][1]][MalcolmPath[MalProg][0]] = 0;
        MalProg++;
        map[MalcolmPath[MalProg][1]][MalcolmPath[MalProg][0]] = 3;
    }

    private void moveMacduff() {
        if(MacProg >= MacduffPath.length - 1){
            return;
        }
        map[MacduffPath[MacProg][1]][MacduffPath[MacProg][0]] = 0;
        MacProg++;
        map[MacduffPath[MacProg][1]][MacduffPath[MacProg][0]] = 5;
    }

    public static boolean checkForMonster(int x, int y){
        return( map[x][y] > 2);
    }

    public Map() {
        pervs = new securityCamera[4];
        pervs[0] = new securityCamera(0);
        pervs[1] = new securityCamera(1);
        pervs[2] = new securityCamera(2);
        pervs[3] = new securityCamera(3);

        /*
        0 = empty
        1 = wall
        2 = safe house
        3 = Malcolm
        4 = Banquo
        5 = Macduff
         */
        int niggggger;
        for(int xb = 1;xb < 10; xb++){
            for(int yb = 1; yb < 8; yb++){

                if(yb == 1){
                    switch(xb){
                        case 4:
                            niggggger = 3;
                            break;
                        case 5:
                            niggggger = 4;
                            break;
                        case 7:
                            niggggger = 5;
                            break;
                        default:
                            niggggger = 0;
                            break;
                    }
                }else if(yb == 2) {
                    niggggger = 0;
                }else if(yb == 3){
                    if(xb == 2 || xb == 7 || xb == 9){
                        niggggger = 0;
                    }else{
                        niggggger = 1;
                    }
                }else if(yb == 4){
                    if(xb == 1 || xb == 8) {
                        niggggger = 1;
                    }else {
                        niggggger = 0;
                    }
                }else if(yb == 5){
                    if(xb == 5 || xb == 6){
                        niggggger = 2;
                    }else if (xb == 1 || xb == 3|| xb == 8){
                        niggggger = 1;
                    } else{
                        niggggger = 0;
                    }
                }else if (yb == 6){
                    if(xb  == 5 || xb == 6){
                        niggggger = 2;
                    }else if (xb == 3){
                        niggggger = 1;
                    }else {
                        niggggger = 0;
                    }
                }else {
                    niggggger = 0;
                }
                map[xb][yb] = niggggger;
            }
        }
    }
}