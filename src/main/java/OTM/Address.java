package OTM;

import javax.persistence.*;

/**
 * Created by azhilin on 31.01.2017.
 */
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "clientAddress")
    String clientAddress;
    @OneToOne (mappedBy = "address", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    Client client = new Client();

    public Address() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
