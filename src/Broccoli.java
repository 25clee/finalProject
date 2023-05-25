public class Broccoli extends Boxies{

    public Broccoli(int x, int y){
        super(x, y);
    }

    public void branch(int x, float len, int color, float theta) {
//        if(key == true){
//            theta = Main.app.random(0,Main.app.PI/3);
//        }
        Main.app.pushMatrix();
        Main.app.stroke(color/4, color/8, color);
        Main.app.line(x, 0, x, -len);
        Main.app.translate(x, -len);
        len *= 0.66;
        if (len > 2) {
            Main.app.pushMatrix();
            Main.app.rotate(theta);
            branch(x,len, color + 100, theta+50);
            Main.app.popMatrix();
            Main.app.pushMatrix();
            Main.app.rotate(-theta);
            branch(x,len, color + 60, theta+50);
            Main.app.popMatrix();
        }
        Main.app.popMatrix();
        }
}
