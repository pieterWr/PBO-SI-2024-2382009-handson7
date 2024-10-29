package contohKelaspertama;

public class mobil {
    String warna ;
    String merek;
    int kecepatanMaks;

    public mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo(){
        System.out.println("Warna : " + warna);
        System.out.println("merek :" + merek);
        System.out.println("KecepatanMaks : " + kecepatanMaks);
    }

    public String getWarna(){
        return warna;
    }

    public String getmerek(){
        return merek;
    }

    public int getkecepataMaks(){
        return kecepatanMaks;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public void setMerek(String merek){
        this.merek = merek;
    }

    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
}