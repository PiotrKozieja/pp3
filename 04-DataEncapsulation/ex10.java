public class ex10 {
    public String name;
    public String surname;
    public String address;
    public String postalc;
    public String city;
    public int drn;
    public int yoi;
    public String dlc;

    public void display(){
        System.out.println(name+" "+surname+" "+address);
    }
    
    public String toString(){
        return name+" "+surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalc() {
        return postalc;
    }

    public void setPostalc(String postalc) {
        this.postalc = postalc;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDrn() {
        return drn;
    }

    public void setDrn(int drn) {
        this.drn = drn;
    }

    public int getYoi() {
        return yoi;
    }

    public void setYoi(int yoi) {
        this.yoi = yoi;
    }

    public String getDlc() {
        return dlc;
    }

    public void setDlc(String dlc) {
        this.dlc = dlc;
    }

}

