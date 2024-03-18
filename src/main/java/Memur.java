public class Memur extends Personel{
    private static final double saatlikUcretMemur =500;
    public Memur(String tamAd, double saatlikUcret, int calismaSaati) {
        super(tamAd, saatlikUcretMemur, calismaSaati);
    }

    @Override
    public double maasHesapla() {
        double maas = super.getCalismaSaatleri()*saatlikUcretMemur;
        if(getCalismaSaatleri()>180){
            int fazladanCalisilanSaat = super.getCalismaSaatleri()-180;
            maas += fazladanCalisilanSaat * saatlikUcretMemur * 1.5;
        }
        return maas;
    }
}
