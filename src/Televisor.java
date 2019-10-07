public class Televisor {
    String tvOnOff;

    Televisor(String onOff){
        tvOnOff = onOff;

    }
    void tvSetOn() {
        tvOnOff = "ON";
    }
    void tvSetOff() {
        tvOnOff = "OFF";
    }
    void showStatus() {
        System.out.println(tvOnOff);
    }
}

//
//    Treść zadania
//
//    Stwórz klasę Televisor, a w niej jedno pole określające, czy telewizor jest włączony, czy wyłączony.
//
//    Dodaj trzy metody:
//
//    turnOn()- włącza telewizor
//    turnOff()- wyłącza telewizor
//    showStatus()- wyświetla informację, czy telewizor jest włączony, czy wyłączony
//
//    Utwórz klasę testową z metodą main, utwórz w niej telewizor (domyślnie powinien być wyłączony), a następnie:
//
//    wyświetl status
//    włącz telewizor i ponownie wyświetl status
//    wyłącz telewizor i ponownie wyświetl status

