package House.Habitaciones;
public class LivingRoom {
    private  int windows;
    private  boolean tv;
    private  boolean homeTeather;
    private int width;
    private int height;
    private String color;
    public void setWindows(int windows){
        this.windows = windows;
    }
    public int getWindows(){
        return windows;
    }
    public void setTv(boolean tv){
        this.tv = tv;
    }
    public boolean isTv(){
        return tv;
    }
    public void setHomeTeather(boolean homeTeather){
        this.homeTeather = homeTeather;
    }
    public boolean isHomeTeather(){
        return homeTeather;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
}
