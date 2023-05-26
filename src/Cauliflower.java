public class Cauliflower extends Boxies{

    public Cauliflower(int x, int y){
        super(x,y);
    }



    public void branch(int x, float len, int color, float theta, float stroke) {
        Main.app.pushMatrix();
        Main.app.stroke(color, color/7, color/3);

        Main.app.pushStyle();
        Main.app.strokeWeight(stroke);
        Main.app.line(x, 0, x, -len);
        Main.app.translate(x, -len);
        len *= 0.66;
        if (len > 2) {
            Main.app.pushMatrix();
            Main.app.rotate(theta);
            branch(x,len, color + 100, theta, (float)(stroke - 0.75));
            Main.app.popMatrix();
            Main.app.pushMatrix();
            Main.app.rotate(-theta);
            branch(x,len, color + 60, theta, (float)(stroke - 0.75));
            Main.app.popMatrix();
        }
        Main.app.popMatrix();
        Main.app.popStyle();
    }

}
