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
@ToString
@Table(name = "orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Orders {

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
    @Column(name = "order_number")
    private  int order_number;
    @Column(name = "status")
    private  String status;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Orders)) return false;
        Orders orders = (Orders) o;
        return id == orders.id && order_number == orders.order_number && Objects.equals(create_data, orders.create_data) && Objects.equals(update_data, orders.update_data) && Objects.equals(status, orders.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, order_number, status);
    }
}
