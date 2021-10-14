package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  Timestamp create_data;
    private  Timestamp update_data;
    private  int order_number;
    private  String status;

    public Orders(@JsonProperty("id") int id,
                  @JsonProperty("create_data") Timestamp create_data,
                  @JsonProperty("update_data") Timestamp update_data,
                  @JsonProperty("order_number") int order_number,
                  @JsonProperty("status") String status) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.order_number = order_number;
        this.status = status;
    }
}
