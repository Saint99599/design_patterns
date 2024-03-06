public interface Shap {
    void saveAsVector(Circle circle);
    void saveAsVector(Triangle triangle);
    void saveAsVector(Rectangle rectangle);

    void saveAsRaster(Circle circle);
    void saveAsRaster(Triangle triangle);
    void saveAsRaster(Rectangle rectangle);
}