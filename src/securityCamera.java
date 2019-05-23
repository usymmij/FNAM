public class securityCamera {
    // int {pairs: {x,y}, {x,y} {x,y}}
    private int[][] eatMyAss;

    public securityCamera(int key){
        eatMyAss = new int[12][2];
        switch(key){
            case 0:
                for(int i = 0; i < 6; i++){
                    eatMyAss[i][0] = i+1;
                    eatMyAss[i][1] = 1;
                }
                for(int i = 6; i < 12; i++) {
                    eatMyAss[i][0] = i-5;
                    eatMyAss[i][1] = 2;
                }
                break;
            case 1:
                for(int i = 0; i < 3; i++){
                    eatMyAss[i][0] = 4;
                    eatMyAss[i][1] = i + 4;
                }
                break;
            case 2:
                 for(int i = 0; i < 3; i++){
                     eatMyAss[i][0] = 9;
                     eatMyAss[i][1] = i + 2;
                 }
                 break;
            case 3:
                for(int i = 0; i < 6; i++) {
                    eatMyAss[i][0] = i+2;
                    eatMyAss[i][1] = 4;
                }
                eatMyAss[6][0] = 7;
                eatMyAss[6][1] = 5;
                break;
        }

    }

    public boolean check(){
        for(int[] coordinate : eatMyAss){
            System.out.println(coordinate[0] + " " + coordinate[1]);
            if (Map.checkForMonster(coordinate[0],coordinate[1])){
                return true;
            }
        }
        return false;
    }

}
