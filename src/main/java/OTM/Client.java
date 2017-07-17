package OTM;

import org.hibernate.engine.spi.CascadeStyle;

import javax.persistence.*;

/**
 * Created by azhilin on 31.01.2017.
 */
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue
    int id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_address")
    Address address;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    Manager manager;

    public Manager getManagerId() {
        return manager;
    }

    public void setManagerId(Manager managerId) {
        this.manager = managerId;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddres() {
        return address;
    }

    public void setAddres(Address addres) {
        this.address = addres;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
