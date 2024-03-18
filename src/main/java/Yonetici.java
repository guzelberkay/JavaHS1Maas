public class Yonetici extends Personel {
    private double bonus;

    public Yonetici(String ad, double saatlikUcret, int calismaSaatleri, double bonus) {
        super(ad, saatlikUcret, calismaSaatleri);
        this.bonus = bonus;
    }



    @Override
    public double maasHesapla() {
            double maas = super.getSaatlikUcreti() * super.getCalismaSaatleri();
            return maas + bonus;
        }
    }
