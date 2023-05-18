import processing.core.PApplet;

public class Main extends PApplet {

    public static PApplet app;
    private float theta;
    public static void main(String[] args){PApplet.main("Main");}

    public Main() {
        super();
        app = this;
    }

    public void settings(){size(800, 600);}

//    public void setup(){frameRate(5);}

    public void draw(){
        background(255);
        theta = map(mouseX,0,width,0,PI/2);
        translate(width/2, height);
        stroke(0);
        branch(60, 216);
    }

    public void branch(float len, int color) {
//        float theta = random(0,PI/3);
        stroke(color/13, color/4, color/2);
        strokeWeight(20);
//        line(0, 0, 0, -len);
        circle(200,100,50);
        translate(0, -len);
        len *= 0.66;
        if (len > 2) {
            pushMatrix();
            rotate(theta);
            branch(len, color + 100);
            popMatrix();
            pushMatrix();
            rotate(-theta);
            branch(len, color + 60);
            popMatrix();
        }
    }
}
//continue below exercise 8.9