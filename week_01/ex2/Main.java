public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FootShape footshape = new FootShape();
        Foot drawType = new Foot(footshape);    
        drawType.draw();  
    }
}