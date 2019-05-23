public class player {
    private int myJUICE = 150;
    private boolean leftit = false;
    private boolean rightit = false;

    public player() {
    }

    public int getmyJUICE(){
        return myJUICE;
    }
    public boolean getleftit(){
        return leftit;
    }

    public boolean getrightit(){
        return rightit;
    }

    public void subtractmyJUICE(){
        myJUICE -= 1;
        if(myJUICE <= 0) {
            FATASS.room(false,false);
            Main.right = false;
            Main.left = false;
        }
    }

    public void invertleftit(){
        leftit = !leftit;
    }

    public void invertrightit(){
        rightit = !rightit;
    }
}
