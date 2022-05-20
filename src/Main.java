class Main {
    private static Ticket[] vTickets;  // Array aller verkauften Tickets
    private static int umsatz = 0; // Gesamtumsatz aller Ticketverkäufe

    public static void main(String[] args) {
     /*
      Auch wenn wir kein Objekt der abstrakten Klasse Ticket erzeugen können, können wir die Klasse als Datentyp nutzen (vergleiche https://repl.it/@buc/Polymorphie)
     */
        vTickets = new Ticket[10];

        vTickets[0] = new SportTicket("LONDON", "CHE-MAN", 50, 4);
        vTickets[1] = new KonzertTicket("BERLIN", "BACH", 74, 37);
        vTickets[2] = new KinoTicket("DRESDEN", "HONEY", 9, 165);
        vTickets[3] = new AutoKinoTicket("PRAG", "E.T.", 5, 115, 4);
        vTickets[4] = new SportTicket("ERFURT", "ERF-DYN", 12, 0);
        vTickets[5] = new KonzertTicket("STUTTGART", "TARZAN", 99, 8);
        vTickets[6] = new SportTicket("BARCELONA", "BAR-MAD", 125, 7);
        vTickets[7] = new KonzertTicket("PORTO", "MARIA PIRES", 79, 1);
        vTickets[8] = new AutoKinoTicket("MOSKAU", "AVATAR", 9, 162, 2);
        vTickets[9] = new KinoTicket("PARIS", "PANEM", 10, 142);

        System.out.println("\n------- Allgemeine Ticketdaten -------\n");

        for (int i = 0; i < vTickets.length; i++) {
        /* 
        Nutzen von Polymorphie. Dadurch wird dank der dynamischen Methodensuche die zum Typ des konkreten Objekts passende    Methodenimplementierung aufgerufen. Da wir die Methode berechneTickepreis() bereits als abstrakte Methode in der Klasse Ticket deklariert haben, ist sie im Datentyp "Ticket" bekannt und kann (ohne Casten) aufgerufen werden.
        */
            umsatz += vTickets[i].berechneTicketpreis();
        }

        // die erweiterte for-Schleife sorgt für leichtere Lesbarkeit
        for (Ticket element : vTickets) {
            System.out.println(element);
        }

        System.out.println("\nGesamtumsatz aller Ticketverkaeufe: " + umsatz + " Euro");
    }
}