public class VectorSaveVisitor implements Shap {
    @Override
    public void saveAsVector(Circle circle) {
        System.out.println("Saving the circle... with radius= " + circle.getRadius() +
                           " at position " + circle.getxPos() + ", " + circle.getyPos() + " as vector");
    }

    @Override
    public void saveAsVector(Triangle triangle) {
        System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                           " height = " + triangle.getHeight() + " at position " +
                           triangle.getxPos() + ", " + triangle.getyPos() + " as vector");
    }

    @Override
    public void saveAsVector(Rectangle rectangle) {
        System.out.println("Saving the rectangle...with width = " + rectangle.getWidth() +
                           " height = " + rectangle.getHeight() + " at position " +
                           rectangle.getxPos() + ", " + rectangle.getyPos() + " as vector");
    }

    @Override
    public void saveAsRaster(Circle circle) {
        System.out.println("Saving the circle... with radius= " + circle.getRadius() +
                " at position " + circle.getxPos() + ", " + circle.getyPos() + " as raster");
    }

    @Override
    public void saveAsRaster(Triangle triangle) {
        System.out.println("Saving the triangle...with base = " + triangle.getBase() +
                " height = " + triangle.getHeight() + " at position " +
                triangle.getxPos() + ", " + triangle.getyPos() + " as raster");
    }

    @Override
    public void saveAsRaster(Rectangle rectangle) {
        System.out.println("Saving the rectangle...with width = " + rectangle.getWidth() +
                " height = " + rectangle.getHeight() + " at position " +
                rectangle.getxPos() + ", " + rectangle.getyPos() + " as raster");
    }
}
