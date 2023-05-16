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

    public void draw(){
        background(255);
        theta = map(mouseX,0,width,0,PI/2);
        translate(width/2, height);
        stroke(0);
        branch(60);
    }

    void branch(float len) {
//        float theta = random(0,PI/3);
        line(0, 0, 0, -len);
        translate(0, -len);
        len *= 0.66;
        if (len > 2) {
            pushMatrix();
            rotate(theta);
            branch(len);
            popMatrix();
            pushMatrix();
            rotate(-theta);
            branch(len);
            popMatrix();
        }
    }
}
