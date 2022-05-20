class KonzertTicket extends Ticket {
    int sitzReihe;

    public KonzertTicket(String ort, String name, int preis, int reihe) {
        super(ort, name, preis);
        sitzReihe = reihe;
    }

    public int berechneTicketpreis() {
        ticketPreis = basisPreis * (1 + 1 / sitzReihe);

        return ticketPreis;
    }
}