public class Circlogo extends Boxies{

    public Circlogo (){
    }
    public void branch(float len, int color, float theta) {
        Main.app.stroke(color/13, color/4, color/2);
        Main.app.strokeWeight(20);
        Main.app.circle(200,100,50);
        Main.app.translate(0, -len);
        len *= 0.66;
        if (len > 2) {
            Main.app.pushMatrix();
            Main.app.rotate(theta);
            branch(len, color + 100, Main.app.map(Main.app.mouseX,0,Main.app.width,0,Main.app.PI/2));
            Main.app.popMatrix();
            Main.app.pushMatrix();
            Main.app.rotate(-theta);
            branch(len, color + 60, Main.app.map(Main.app.mouseX,0,Main.app.width,0,Main.app.PI/2));
            Main.app.popMatrix();
        }
    }
}
