public class Porow {
    public String Compare(int x, int y){
        int z = x - y;
        String wynik = "Pierwsze auto ma o: "+z+" KM więcej niż drugie";
        String wynik2 = "Pierwsze auto ma o: "+z*-1+" KM mniej niż drugie";

        if (z>0){
            return wynik;
        }
        return wynik2;
    }
}
