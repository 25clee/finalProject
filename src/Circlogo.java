public class Circlogo extends Boxies{

    public Circlogo (int x, int y){
        super(x, y);
    }
    public void branch(float len, int color, float theta) {

        Main.app.pushMatrix();
        Main.app.stroke(color/13, color/4, color/2);
        Main.app.noFill();
        Main.app.circle(20,20, /* x and y control how big circles rotate*/ 10 /*size of circle*/);
        Main.app.translate(0, -len);
        len *= 0.66;
        if (len > 2) {
            Main.app.pushMatrix();
            Main.app.rotate(-theta);
            branch(len, color + 100, theta);
            Main.app.popMatrix();
            Main.app.pushMatrix();
            Main.app.rotate(theta);
            branch(len, color + 60, theta);
            Main.app.popMatrix();
        }
        Main.app.popMatrix();
//        Main.app.stroke(color/13, color/4, color/2);
//        Main.app.strokeWeight(2/*20*/);
//        Main.app.circle(200,100,50);
//        Main.app.translate(0, -len);
//        len *= 0.66;
//        if (len > 2) {
//            Main.app.pushMatrix();
//            Main.app.rotate(theta);
//            branch(len, color + 100, Main.app.map(Main.app.mouseX,0,Main.app.width,0,Main.app.PI/2));
//            Main.app.popMatrix();
//            Main.app.pushMatrix();
//            Main.app.rotate(-theta);
//            branch(len, color + 60, Main.app.map(Main.app.mouseX,0,Main.app.width,0,Main.app.PI/2));
//            Main.app.popMatrix();
        }
}
