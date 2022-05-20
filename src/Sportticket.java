/*
  Da alle abstrakten Methoden implementiert sind, muss die Klasse SportTicket nicht mehr abstrakt sein.
*/
class SportTicket extends Ticket {
    int pokalStufe;

    public SportTicket(String ort, String name, int preis, int stufe) {
        super(ort, name, preis);
        pokalStufe = stufe;
    }

    // Konkretisieren der abstrakten Methode durch Implementieren in der Subklasse
    public int berechneTicketpreis() {
        ticketPreis = basisPreis + (10 * pokalStufe);

        return ticketPreis;
    }
}