class Variables {
    // utworzenie 2 zmiennych typu tekstowego i ich inicjalizacja
    public static String SEPARATOR_Spacja = " ";
    public static void main(String[] args) {
        String a = "Ala"; // tworzy zmienna i przypisuje do niej wartosc
        String b = "ma"; // tworzy druga zmienna i przypisuje do niej wartosc
        String c = "kota"; //trzecia zmienna
        System.out.println (a + SEPARATOR_Spacja + b + SEPARATOR_Spacja + c); // dodawanie tekstow do siebie - nie wiem jak dodać spacje

    // utworzenie 2 zmiennych typu liczba calkowita ich inicjalizacja i dodawanie
        int kotyAli = 2; // tworzy zmienna i przypisuje do niej wartosc
        int kotyOli = 3; // obie liczby sa sobie rowne
        int sumaKotow = kotyAli + kotyOli;
        System.out.println ("Ala ma " + kotyAli );
        System.out.println ("Ola ma " + kotyOli);
        System.out.println ("Ala i Ola maja razem " + sumaKotow + " kotow");

        // utworzenie 2 zmiennych przecinkowych ich inicjalizacja i mnożenie
        double wagaKarmy = 1.12;
        double liczbaDni = 7;
        var zapotrzebowanie = wagaKarmy * liczbaDni;
        System.out.println ("Koty jedza " + wagaKarmy + " kg karmy dziennie ");
        System.out.println ("Koty jedza " + zapotrzebowanie + " kg karmy tygodniowo ");

        //komentarz


        //


    }
}


