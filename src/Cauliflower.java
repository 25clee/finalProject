public class Cauliflower extends Boxies{
    public Cauliflower(){
    }
    //frameRate
    public void branch(float len, int color) {
        Main.app.frameRate(5);
        float theta = Main.app.random(0,Main.app.PI/3);
        Main.app.stroke(color/13, color/4, color/2);
        Main.app.line(0, 0, 0, -len);
        Main.app.translate(0, -len);
        len *= 0.66;
        if (len > 2) {
            Main.app.pushMatrix();
            Main.app.rotate(theta);
            branch(len, color + 100);
            Main.app.popMatrix();
            Main.app.pushMatrix();
            Main.app.rotate(-theta);
            branch(len, color + 60);
            Main.app.popMatrix();
        }
    }
}
