import processing.core.PApplet;
import java.util.ArrayList;
public class Main extends PApplet {

    public static PApplet app;
    final int NUM_BOXIES = 4;
    private ArrayList<Boxies> boxie1;
    private ArrayList<Boxies> boxie2;

    private ArrayList<Boxies> boxie3;

    public Main() {
        super();
        app = this;
    }

    public static void main(String[] args){PApplet.main("Main");}

    public void settings(){size(800, 600);}


    public void setup(){

        boxie1 = new ArrayList<Boxies>();
        boxie2 = new ArrayList<Boxies>();
        boxie3 = new ArrayList<Boxies>();

        int w = width/NUM_BOXIES;
        Boxies b1;
        Boxies b2;
        Boxies b3;
        for (int i = 0; i<NUM_BOXIES; i++){
            int x = i*w;
            b1 = new Cauliflower(x,0);
            b2 = new Broccoli(x,0);
            b3 = new Circlogo(x,0);
//            if (i % 2 == 0){
//                b = new Cauliflower(0,0);
//            } else {
//                b = new Circlogo(0,0);
//            }
            boxie1.add(b1);
            boxie2.add(b2);
            boxie3.add(b3);
        }
    }

    public void draw(){
        background(255);
        translate(100, height);
        stroke(0);

        for(Boxies b : boxie1){
            b.branch(0, 60, 216, map(mouseX,0,width,0,PI/2));
            translate(200,0);
        }

        translate(-800,-200);

        for(Boxies b : boxie2){
            b.branch(0, 60, 216, map(mouseX,0,width,0,PI/2));
            translate(200,0);
        }

        translate(-800,-200);

        for(Boxies b : boxie3){
            b.branch( 60, 216, map(mouseX,0,width,0,PI/2));
            translate(200,0);
        }

        translate(-800,-200);

    }


    private float theta;
    private boolean key;
    public void keyPressed(){
        key = true;
//        theta = Main.app.random(0,Main.app.PI/3);
//        broccoli.branch(0, 60, 216, theta);
    }


}