
public class NotLSystem extends Boxies{

    String sentence;

    public NotLSystem(String sentence){
        super();
        this.sentence = sentence;
    }

    public void hex1() {
        Main.app.pushStyle();
        Main.app.pushMatrix();

        Main.app.stroke(255);
        Main.app.strokeWeight(3);
        int len = 10;
        float theta = Main.app.PI / 3;

        for (int i = 0; i < sentence.length(); i++) {

            char c = sentence.charAt(i);

            if (c == 'F') {
                Main.app.line(0, 0, len, 0);
                Main.app.translate(len, 0);
            } else if (c == 'G') {
                Main.app.translate(len, 0);
            } else if (c == '+') {
                Main.app.rotate(theta);
            } else if (c == '-') {
                Main.app.rotate(-theta);
            } else if (c == '[') {
                Main.app.pushMatrix();
            } else if (c == ']') {
                Main.app.popMatrix();
            }
        }
        Main.app.popMatrix();
        Main.app.popStyle();
    }

    public void hex2(){
        Main.app.pushStyle();
        Main.app.pushMatrix();

        Main.app.stroke(255);
        Main.app.strokeWeight(3);
        int len = 10;
        float theta = Main.app.PI / 3;


        for(int i = 0; i<sentence.length(); i++){

            char c = sentence.charAt(i);

            if (c == 'F') {
                Main.app.line(0,0,len,0);
                Main.app.translate(len,0);
            } else if (c == 'G') {
                Main.app.translate(len,0);
            } else if (c == '+') {
                Main.app.rotate(-theta);
            } else if (c == '-') {
                Main.app.rotate(theta);
            } else if (c == '[') {
                Main.app.pushMatrix();
            } else if (c == ']') {
                Main.app.popMatrix();
            }
        }
        Main.app.popMatrix();
        Main.app.popStyle();

    }

}