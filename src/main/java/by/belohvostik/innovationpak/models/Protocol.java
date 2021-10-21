package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "protocol")@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ToString
public class Protocol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private  Timestamp create_data;
    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:ss")
    private  Timestamp update_data;
    @Column(name = "contract_id")
    private  int contract_id;
    @Column(name = "order_id")
    private  int order_id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Protocol)) return false;
        Protocol protocol = (Protocol) o;
        return id == protocol.id && contract_id == protocol.contract_id && order_id == protocol.order_id && Objects.equals(create_data, protocol.create_data) && Objects.equals(update_data, protocol.update_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, contract_id, order_id);
    }
}
