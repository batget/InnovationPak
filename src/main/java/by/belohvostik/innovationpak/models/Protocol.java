package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "protocol")
public class Protocol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  Timestamp create_data;
    private  Timestamp update_data;
    private  int contact_id;
    private  int order_id;

    public Protocol(@JsonProperty("id") int id,
                    @JsonProperty("create_data") Timestamp create_data,
                    @JsonProperty("update_data") Timestamp update_data,
                    @JsonProperty("contact_id") int contact_id,
                    @JsonProperty("order_id") int order_id) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.contact_id = contact_id;
        this.order_id = order_id;
    }
}
