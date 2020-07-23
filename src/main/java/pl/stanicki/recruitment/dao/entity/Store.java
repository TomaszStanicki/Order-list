package pl.stanicki.recruitment.dao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;


@Entity
public class Store {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;
    private LocalDate date;

    private String item;
    private String name;
    private String surname;

    private Store() {
    }

    public Store(int id, String item, String name, String surname, LocalDate date) {
        this.id = id;
        this.item = item;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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



    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", date=" + date +
                '}';
    }
}

