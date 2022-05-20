/*
Es gibt immer wieder das Szenario, dass wir für unsere Klassenhierachie eine sinnvolle Basisklasse finden, konkrete Objekte von dieser Basisklasse aber nicht sinnvoll sind. Wenn wir zum Beispiel an die UE Medien denken, machen Objekte der Klassen Festplatte, UsbStick und DVD Sinn. Die Klasse MediumNurLesbar und MediumBeschreibbar sind eher nur Ordnungsbegriffe und Objekte dieser Klassen nicht wirklich sinnvoll.

Deswegen gibt es abstrakte Klassen. Eine abstrakte Klasse bezeichnet in der objektorientierten Programmierung eine spezielle Klasse, welche sich per Definition nicht instanziieren lässt (d. h., es lassen sich keine Objekte von ihr erzeugen). Der Versuch,ein Objekt einer abstract-Klasse mit new zu erzeugen, führt zu einem Fehler.

Sie werden oft verwendet, um Eigenschaften und Fähigkeiten einer allgemeinen Typgruppe zu definieren, deren abgeleitete Unterklassen diese dann weiter spezifizieren.

Abstrakte Klassen können, wie normale Klassen, Konstruktoren, Variablen und Methoden haben. Neu ist die Möglichkeit für abstrakte Methoden. Abstrakte Methoden bestehen lediglich aus ihre Signatur, die mit einem Semikolon abgeschlossen werden muss. Als Zugriffsmodifikatoren dürfen nur public oder protected angegeben werden. Ein Methodenkörper fehlt an dieser Stelle völlig. Mit Hilfe von abstrakten Methoden stellen wir sicher, dass alle Subklassen diese Methode haben müssen. Die konkrete Implementierung überlassen wir aber den Subklassen.

Sobald eine Klasse mindestens eine abstrakte Methode besitzt, muss die Klasse auch abstrakt sein. Eine Subklasse muss die Methode überschreiben und implementieren, damit diese Klasse nicht mehr abstrakt ist und Objekte instanziiert werden können.
*/


/* 
Das Schlüsselwort "abstract" machte eine Klasse zur abstrakten Klasse.
*/
public abstract class Ticket {
    String eventOrt;
    String eventName;
    int basisPreis;
    int ticketPreis;

    public Ticket(String ort, String name, int preis) {
        eventOrt = ort;
        eventName = name;
        basisPreis = preis;
    }

    /*
     berechneTicketpreis() deklariert eine abstrakte Methode. Es macht die Methode für Subklassen bekannt
    implementiert die Methode aber nicht. Dies muss noch in den Subklassen erfolgen.

     D.h. wir wollen, dass jedes Ticket ihren Ticketpreis berechnen können muss. Wie das aber für ein konkretes Ticket aussieht, können wir hier nicht entscheiden, sondern überlassen es den Subklassen.
    */
    public abstract int berechneTicketpreis();

    public String toString() {
        String text;
        text = "Eventort: " + eventOrt;
        text += ", Eventname: " + eventName;
        text += ", Preis: " + ticketPreis + " Euro";
        return text;
    }
}