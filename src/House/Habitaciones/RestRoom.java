package House.Habitaciones;

public class RestRoom {
    private boolean showerCabin;
    private int width;
    private int height;
    private String color;
    public void setShowerCabin(boolean showerCabin){
        this.showerCabin = showerCabin;
    }
    public boolean isShowerCabin(){
        return showerCabin;
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
