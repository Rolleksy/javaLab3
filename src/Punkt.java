/* klasa Punkt */
public class Punkt {
    /* stworzyć zmienne prywatne pX, pY, pZ */
    private int pX;
    private int pY;
    private int pZ;
    /* stworzyć
        a) pusty konstruktor,
        b) konstruktor inicjalizujacy zmienną pX,
        c) konstruktor inicjalizujący wszystkie zmienne,
        d) stworzyć settery i gettery,
        e) getter do zmiennej pZ niech zwraca return pZ * 10;

        podpowiedz ALT + INSERT można wybrać generowanie automatyczne
        konstruktora, getterów, setterów, nadpisywanie metody toString() i inne ...
    */
    public int getX(int x) {
        return this.pX;
    }

    public int getY(int y) {
        return this.pY;
    }

    public int getZ(int z) {
        return this.pZ * 10;
    }

    public void setXYZ(int x, int y, int z){
        this.pX = x;
        this.pY = y;
        this.pZ = z;
    }
    public int suma(){
        int suma = pX+pY+pZ;
        return suma;
    }
    public int roznica(){
        int roznic = pX - pY - pZ;
        return roznic;
    }
    public int roznica(int x, int y, int z){
        int roznic = x*pX - y*pY -z*pZ;
        return  roznic;
    }


    /* Stworzyć metody
        a) suma - sumująca wszystkie wartości w klasie
        b) różnica - metody przeciążone roznica(){} i roznica(int x, int y, int z){}
        c) metody różnica mają wykonwywać dzialania :
            roznica(){ return pX - pY - pZ} i roznica(int x, int y, int z){ return pX*x - pY*y - pZ*z }
        d) nadpisać metodę toString(), aby zwracała wszystkie wartości pól, analogicznie jak w przykładzie
     */
}
