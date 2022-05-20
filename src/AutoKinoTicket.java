class AutoKinoTicket extends KinoTicket {
    int anzahlPersonen;

    public AutoKinoTicket(String ort, String name, int preis, int dauer, int personen) {
        // Aufruf des Superkonstruktors (hier Konstruktor der KinoTicket-Klasse)
        super(ort, name, preis, dauer);
        anzahlPersonen = personen;
    }

    public int berechneTicketpreis() {
        // Aufruf der Methodenimplementierung der Superklasse (hier KinoTicket-Klasse)
        ticketPreis = super.berechneTicketpreis() * anzahlPersonen;

        return ticketPreis;
    }
}