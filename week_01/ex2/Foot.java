import java.util.Scanner;

public class Foot {
    
    private FootShape fs;
    public Foot(FootShape fs) {
        this.fs = fs;
    }

    public void draw() {
        Scanner input = new Scanner(System.in);
        System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
        int type = input.nextInt();
    
        switch(type) {
            case 1:
                fs.drawAsEllipse(new Ellipse());
                break;
            case 2:
                fs.drawAsRectangle(new Rectangle());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
    
    
}
