import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;

public abstract class FATASS implements KeyListener{
    private static String wildwildwest = "D:\\1 1MyFiles\\FNAM\\wildwildwest\\";
    private static char[] alphabetInc = new char[26];

    private static ImageIcon din = new ImageIcon(wildwildwest + "win.png");
    private static ImageIcon dead = new ImageIcon(wildwildwest + "dead.jpg");
    private static ImageIcon milk = new ImageIcon(wildwildwest + "officeRL.png");
    private static ImageIcon banq = new ImageIcon(wildwildwest + "banq.png");
    private static ImageIcon spoiledMilk = new ImageIcon(wildwildwest + "officeL.png");
    private static ImageIcon goodMilk = new ImageIcon(wildwildwest + "officeR.png");
    private static ImageIcon oldMilk = new ImageIcon(wildwildwest + "office.png");
    private static ImageIcon littleShitter = new ImageIcon(wildwildwest + "black.jpg");
    private static ImageIcon ASSHOLE = new ImageIcon(wildwildwest + "communism.png");
    private static ImageIcon sumPiss = new ImageIcon(wildwildwest + "peepHole.png");
    private static ImageIcon turd = new ImageIcon(wildwildwest + "IvansShit.png");
    private static ImageIcon Mal = new ImageIcon(wildwildwest + "Malcolm.jpg");
    private static ImageIcon Ban = new ImageIcon(wildwildwest + "Banquo.jpg");
    private static ImageIcon Mac = new ImageIcon(wildwildwest + "Macduff.jpg");
    private static ImageIcon Fle = new ImageIcon(wildwildwest + "Fleance.jpg");
    private static JLabel bigShitter = new JLabel(littleShitter);
    private static JFrame frame = new JFrame("Kill Me Now");
    private static JLabel woot = new JLabel("100", SwingConstants.LEADING);

    abstract static class AbstractAction extends javax.swing.AbstractAction {
        public char keyBounded;

        public AbstractAction(char key) {
            super();
            keyBounded = key;
        }
    }

    private static void setKeyBinding(char key, AbstractAction act) {
        bigShitter.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(key),key);
        bigShitter.getActionMap().put(key, act);
    }

    public static void updateText() {
       woot.setText(Integer.toString(Main.assholeTrynaPlay.getmyJUICE()));
    }

    public static void weee() {
        bigShitter.setIcon(din);
    }

    public static void ded() {
        bigShitter.setIcon(dead);
    }

    public static void banq() {
        bigShitter.setIcon(banq);
    }

    public static void killPage(String yeet) {
        if(yeet == "Mal") {
            bigShitter.setIcon(Mal);
        } else if(yeet == "Ban") {
            bigShitter.setIcon(Ban);
        } else if(yeet == "Mac") {
            bigShitter.setIcon(Mac);
        } else if(yeet == "Fle") {
            bigShitter.setIcon(Fle);
        }
    }

    public static void room(boolean right, boolean left){
        if(right) {
            if(left) {
                bigShitter.setIcon(oldMilk);
            } else {
                bigShitter.setIcon(spoiledMilk);
            }
        } else {
            if(left) {
                bigShitter.setIcon(goodMilk);
            } else {
                bigShitter.setIcon(milk);
            }
        }
    }

    public static void mmmap() { bigShitter.setIcon(ASSHOLE);}

    public static void cam() {bigShitter.setIcon(sumPiss);}

    public static void monCam() {bigShitter.setIcon(turd);}

    public static void setup() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        downTheShitter();
        frame.setVisible(true);
    }

    private static void downTheShitter(){
        frame.setFocusable(true);
        frame.setFocusTraversalKeysEnabled(false);
        woot.setFont(new Font("neat",Font.PLAIN,50));
        bigShitter.setLayout(new BorderLayout());
        bigShitter.add(woot);
        frame.add(bigShitter);
        for(int i = 0; i < 26; i++){
            alphabetInc[i] = (char)(i + 97);
        }

        for(int i = 0; i < 26; i++) {
            setKeyBinding(alphabetInc[i], new AbstractAction(alphabetInc[i]) {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(keyBounded);
                    Main.pressed(keyBounded);
            }
            });
        }
    }

}
