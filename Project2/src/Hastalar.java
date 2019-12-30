


public class Hastalar  {

    public Hastalar(String isimSoyisim,int tcKimlikNo,int yaş,String cinsiyet,String hastalıkİsmi,String randevuSaati,String klinik,String doktor) {
        
         this.isimSoyisim = isimSoyisim;
       this.tcKimlikNo = tcKimlikNo;
        this.yaş = yaş;
        this.cinsiyet = cinsiyet;
        this.hastalıkİsmi = hastalıkİsmi;
        this.randevuSaati = randevuSaati;
        this.klinik = klinik;
        this.doktor = doktor;
        
        
        
        
    }
    
    int id;
    String isimSoyisim;
    String hastalıkİsmi;
    String doktor;
    String klinik;
    int yaş;
    int tcKimlikNo;
    String cinsiyet;
    String randevuSaati;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public String getHastalıkİsmi() {
        return hastalıkİsmi;
    }

    public void setHastalıkİsmi(String hastalıkİsmi) {
        this.hastalıkİsmi = hastalıkİsmi;
    }

    public String getDoktor() {
        return doktor;
    }

    public void setDoktor(String doktor) {
        this.doktor = doktor;
    }

    public String getKlinik() {
        return klinik;
    }

    public void setKlinik(String klinik) {
        this.klinik = klinik;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    public int getTcKimlikNo() {
        return tcKimlikNo;
    }

    public void setTcKimlikNo(int tcKimlikNo) {
        this.tcKimlikNo = tcKimlikNo;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getRandevuSaati() {
        return randevuSaati;
    }

    public void setRandevuSaati(String randevuSaati) {
        this.randevuSaati = randevuSaati;
    }
    
}
