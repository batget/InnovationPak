package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
@Table(name = "customer")
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "addres")
    private String addres;
    @Column(name = "unp")
    private String unp;
    @Column(name = "okpo")
    private String okpo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(name, customer.name) && Objects.equals(addres, customer.addres) && Objects.equals(unp, customer.unp) && Objects.equals(okpo, customer.okpo) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, addres, unp, okpo);
    }
}
