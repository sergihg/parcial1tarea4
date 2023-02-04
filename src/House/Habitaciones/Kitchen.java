package House.Habitaciones;
public class Kitchen {
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private  int width;
    private  int height;
    private String color;
    public void setStove(boolean stove){
        this.stove = stove;
    }
    public boolean isStove() {
        return stove;
    }
    public void setSink(boolean sink){
        this.sink = sink;
    }
    public boolean isSink() {
        return sink;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }
    public int getWindows(){
        return windows;
    }
    public void setRefrigerator(boolean refrigerator){
        this.refrigerator = refrigerator;
    }
    public boolean isRefrigerator(){
        return refrigerator;
    }
    public void setOven(boolean oven){
        this.oven = oven;
    }
    public boolean isOven(){
        return oven;
    }
    public void setWidth(int width) {
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
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {

        return color;
    }
}
