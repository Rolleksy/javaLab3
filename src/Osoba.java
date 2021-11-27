public class Osoba {
    private String imie;
    private String nazwisko;
    private int indeks;

    public void setImie(String x) {
        this.imie = x;
    }

    public void setNazwisko(String y) {
        this.nazwisko = y;
    }

    public void setIndeks(int z) {
        this.indeks = z;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public String podajDane() {
        String wynik = "Imie: " + getImie() + ", nazwisko: " + getNazwisko() + ", indeks: " + getIndeks();
        return wynik;
    }
}