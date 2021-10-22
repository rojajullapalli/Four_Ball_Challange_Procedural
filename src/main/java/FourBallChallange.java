import processing.core.PApplet;

public class FourBallChallange extends PApplet {

    public static final int WIDTH = 648;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 32;
    float circle1;
    float circle2;
    float circle3;
    float circle4;
    int x1 =2,x2 =3,x3 =4,x4 =5;

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw(){
        ellipse(circle1,HEIGHT/12,DIAMETER,DIAMETER);
        ellipse(circle2,HEIGHT/2.7f,DIAMETER,DIAMETER);
        ellipse(circle3,HEIGHT/1.5f,DIAMETER,DIAMETER);
        ellipse(circle4,HEIGHT/1.1f,DIAMETER,DIAMETER);
        circle1 +=x1;
        circle2 +=x2;
        circle3 +=x3;
        circle4 +=x4;
    }

    public static void main(String[] args) {
        PApplet.main("FourBallChallange",args);
    }

}
