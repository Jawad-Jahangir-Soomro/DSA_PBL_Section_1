public class Universities {
    //attributes of university
    private String name;
    private String WorldRanking;
    private	String AsianRanking;
    private	String PakistanRanking;
    private	String location;
    private int publications;
    //constructor

    public Universities(String name,String WorldRanking,String AsianRanking,String PakistanRanking,String location,int publications) {
        this.name=name;
        this.WorldRanking=WorldRanking;
        this.AsianRanking=AsianRanking;
        this.PakistanRanking=PakistanRanking;
        this.location=location;
        this.publications=publications;
    }
    //get functions
    public String getName() {
        return name;
    }
    public String getWr() {
        return WorldRanking;
    }
    public String getAr() {
        return AsianRanking;
    }
    public String getPr() {
        return PakistanRanking;
    }
    public String getLoc() {
        return location;
    }
    public int getPub() {
        return publications;
    }
}
