import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet {

    public static PApplet app;
    final int NUM_BOXIES_HORIZONTAL = 3;
    final int NUM_BOXIES_VERTICAL = 3;
    private ArrayList<Boxies> boxies;
    private Cauliflower cauliflower;
    private Circlogo circlogo;


    public Main() {
        super();
        app = this;
    }

    public static void main(String[] args){PApplet.main("Main");}

    public void settings(){size(800, 600);}

    public void setup(){
        boxies = new ArrayList<Boxies>();
        int h = height/NUM_BOXIES_VERTICAL;
        int w = width/NUM_BOXIES_HORIZONTAL;
        Boxies b;
        for (int i = 0; i<NUM_BOXIES_VERTICAL; i++){
            int y = i*h;
            for (int j = 0; j<NUM_BOXIES_HORIZONTAL; j++){
                int x = j*w;
                if (i % 2 == 0){
                    b = new Cauliflower();
                } else {
                    b = new Circlogo();
                }
            }
        }
        cauliflower = new Cauliflower();
        circlogo = new Circlogo();
    }

    public void draw(){
        background(255);
        translate(width/2, height);
        stroke(0);
//        cauliflower.branch(60, 216);
//        circlogo.branch(60,216, map(mouseX,0,width,0,PI/2));
        // use display to draw the boxies?
    }


}