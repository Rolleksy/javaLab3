public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto("VW", "ID4 GTX", 320);
        auto.wypluj();
        Auto auto1 = new Auto("BMW", "120i", 184);
        auto1.wypluj();
        Auto auto2 = new Auto("Audi", "eTron GT", 420);
        auto2.wypluj();
        Porow poro = new Porow();
        System.out.println(poro.Compare(auto.getMoc(), auto1.getMoc()));
        System.out.println(poro.Compare(auto1.getMoc(), auto2.getMoc()));

        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

    }
}
