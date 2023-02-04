package House;
import House.Habitaciones.*;
import House.Exterior.*;

public class House {
    private int indexBedRooms=0;
    private int indexRestRooms=0;
    public static final int MAX_BED_ROOMS = 10;
    public static final int MAX_REST_ROOMS = 10;
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[]restRooms = new RestRoom[MAX_REST_ROOMS];
    private BedRoom[]bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;
    public void setKitchen(Kitchen kitchen){
        this.kitchen = kitchen;
    }
    public Kitchen getKitchen(){
        return kitchen;
    }
    public void setDiningRoom(DiningRoom diningRoom){
        this.diningRoom = diningRoom;
    }
    public DiningRoom getDiningRoom(){
        return diningRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom){
        this.livingRoom = livingRoom;
    }
    public LivingRoom getLivingRoom(){
        return livingRoom;
    }
    public void setRestRoom(RestRoom restRoom, int index){
        this.restRooms[index] = restRoom;
    }
    public RestRoom getRestRoom(int index){
        return restRooms[index];
    }
    public void setBedRoom(BedRoom bedRoom, int index){
        this.bedRooms[index] = bedRoom;
    }
    public BedRoom getBedRoom(int index){
        return bedRooms[index];
    }
    public void setYard(Yard yard){
        this.yard = yard;
    }
    public Yard getYard(){
        return yard;
    }
    public  void addRoom(BedRoom bedRoom){
        if(indexBedRooms<MAX_BED_ROOMS){
            bedRooms[indexBedRooms]=bedRoom;
            indexBedRooms++;
        }
    }
    public void addRoom(RestRoom restRoom){
        if(indexRestRooms<MAX_REST_ROOMS){
            restRooms[indexRestRooms]=restRoom;
            indexBedRooms++;
        }
    }
}