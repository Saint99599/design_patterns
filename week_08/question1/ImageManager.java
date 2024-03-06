public class ImageManager {
    private Show renderer;
    public void setRenderer(Show renderer) {
		this.renderer = renderer;
	}
	public void show() {
		this.renderer.Renderer();	
	}
}

