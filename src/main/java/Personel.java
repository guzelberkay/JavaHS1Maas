public abstract class Personel {
    private String tamAd;
    private double saatlikUcreti;
    private int calismaSaati;

    public Personel(String tamAd, double saatlikUcreti, int calismaSaati) {
        this.tamAd = tamAd;
        this.saatlikUcreti = saatlikUcreti;
        this.calismaSaati = calismaSaati;
    }

    public String getTamAd() {
        return tamAd;
    }

    public void setTamAd(String tamAd) {
        this.tamAd = tamAd;
    }

    public double getSaatlikUcreti() {
        return saatlikUcreti;
    }

    public void setSaatlikUcreti(double saatlikUcreti) {
        this.saatlikUcreti = saatlikUcreti;
    }

    public int getCalismaSaatleri() {
        return calismaSaati;
    }

    public void setCalismaSaatleri(int calismaSaatleri) {
        this.calismaSaati = calismaSaatleri;
    }
    public abstract double maasHesapla();
}
