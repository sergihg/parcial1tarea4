package House.Habitaciones;
import House.Muebles.BedSize;
public class BedRoom {
    public BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    public void setBedSize(BedSize bedSize){
        this.bedSize = bedSize;
    }
    public BedSize getBedSize(){
        return bedSize;
    }
    public void setTv(boolean tv){
        this.tv = tv;
    }
    public boolean isTv(){
        return tv;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getHeight(){
        return height;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
}
