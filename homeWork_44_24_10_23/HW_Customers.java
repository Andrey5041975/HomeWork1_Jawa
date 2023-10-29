package lesson44.homeWork_44_24_10_23;

public class HW_Customers {
    /*
   cnum int primary key not null,
   cname text not null,
   city text not null,
   rating integer not null,
   snum int not null
    */
    private int cnum;
    private  String cname;
    private String city;
    private int rating;
    private int snum;

    public HW_Customers() {
    }

    public HW_Customers(int cnum, String cname, String city, int rating, int snum) {
        this.cnum = cnum;
        this.cname = cname;
        this.city = city;
        this.rating = rating;
        this.snum = snum;
    }

    public int getCnum() {
        return cnum;
    }

    public void setCnum(int cnum) {
        this.cnum = cnum;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getSnum() {
        return snum;
    }

    public void setSnum(int snum) {
        this.snum = snum;
    }

    @Override
    public String toString() {
        return "HW_Customers{" +
                "cnum=" + cnum +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", rating=" + rating +
                ", snum=" + snum +
                '}';
    }
}
