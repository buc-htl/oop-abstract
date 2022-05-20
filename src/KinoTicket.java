class KinoTicket extends Ticket {
    int filmDauer;

    public KinoTicket(String ort, String name, int preis, int dauer) {
        // Aufruf des Superkonstruktors (hier Konstruktor der Ticket-Klasse)
        super(ort, name, preis);
        filmDauer = dauer;
    }

    public int berechneTicketpreis() {
        ticketPreis = basisPreis;

        if (filmDauer > 150) {
            ticketPreis += 3;
        }

        return ticketPreis;
    }
}