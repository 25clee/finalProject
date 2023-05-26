import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet {

    public static PApplet app;
    final int NUM_BOXIES = 4;

    private float click;

    private ArrayList<Boxies> boxie1;
    private ArrayList<Boxies> boxie2;

    private ArrayList<Boxies> boxie3;
    private ArrayList<Boxies> boxie4;

    public Main() {
        super();
        app = this;
    }

    public static void main(String[] args){PApplet.main("Main");}

    public void settings(){size(800, 750);}


    public void setup(){

        boxie1 = new ArrayList<Boxies>();
        boxie2 = new ArrayList<Boxies>();
        boxie3 = new ArrayList<Boxies>();
        boxie4 = new ArrayList<Boxies>();

        int w = width/NUM_BOXIES;
        Boxies b1;
        Boxies b2;
        Boxies b3;
        Boxies b4;

        for (int i = 0; i<NUM_BOXIES; i++){
            int x = i*w;
            b1 = new Cauliflower(x,0);
            b2 = new Broccoli(x,0);
            b3 = new Circlogo(x,0);

            boxie1.add(b1);
            boxie2.add(b2);
            boxie3.add(b3);
        }

        for (int i = 0; i<NUM_BOXIES+3; i++){
            b4 = new NotLSystem("FG+FG+FG-FG-FG-FG-FG-FG-FG+FG+FG+FG-FG-FG-FG-FG-FG-FG");
            boxie4.add(b4);
        }
    }

    public void draw(){
        background(0);

        translate(80, 100);
        for(Boxies b : boxie4){
            b.hex1();
            b.hex2();
            translate(100,0);
        }
        translate(-780,-100);

        translate(100, height);

        for(Boxies b : boxie1){
            b.branch(0, 60, 700, map(mouseX,0,width,0,PI/2), 7);
            translate(200,0);
        }

        translate(-800,-200);

        for(Boxies b : boxie2){
            b.branch(0, 60, 400, click);
            translate(200,0);
        }

        translate(-800,-250);

        for(Boxies b : boxie3){
            b.branch( 30 /*how many circles*/, 400, map(mouseX,0,width,0,PI/2)) /*when the circles stop moving*/;
            translate(200,0);
        }

        translate(-800,-200);

    }

    public void keyPressed(){
        click = (random(0,PI/3));
    }

}