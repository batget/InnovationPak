package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "customer")
@RequiredArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  String name;
    private  String addres;
    private  String unp;
    private  String okpo;

    public Customer(@JsonProperty("id") int id,
                    @JsonProperty("name") String name,
                    @JsonProperty("addres") String addres,
                    @JsonProperty("unp") String unp,
                    @JsonProperty("okpo") String okpo) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.unp = unp;
        this.okpo = okpo;
    }
}
