import java.util.UUID;

public class Tickets {
    UUID uuid;
    int number;

    public static Tickets[] makeTicket(int limit){
        Tickets[] tickets = new Tickets[limit];
        UUID uuid =  UUID.randomUUID();
        for (int i = 0; i < limit;i++){
            tickets[i] = new Tickets(uuid,i);

        }
        return tickets;
    }

    public Tickets(UUID uuid, int number) {
        this.uuid = uuid;
        this.number = number;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
