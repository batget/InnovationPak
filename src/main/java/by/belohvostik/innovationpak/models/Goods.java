package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Getter
@Setter
@Entity
@ToString
@Table(name = "goods")
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Goods {

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
    @Column(name = "oreder_id")
    private  int order_id;
    @Column(name = "name")
    private  String name;
    @Column(name = "count")
    private  int count;
    @Column(name = "price_per_item")
    private  float price_per_item;
    @Column(name = "pack_amount")
    private  float pack_amount;
    @Column(name = "nds_amount")
    private  float nds_amount;
    @Column(name = "summ_amount")
    private  float summ_amount;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Goods)) return false;
        Goods goods = (Goods) o;
        return id == goods.id && order_id == goods.order_id && count == goods.count && Float.compare(goods.price_per_item, price_per_item) == 0 && Float.compare(goods.pack_amount, pack_amount) == 0 && Float.compare(goods.nds_amount, nds_amount) == 0 && Float.compare(goods.summ_amount, summ_amount) == 0 && Objects.equals(create_data, goods.create_data) && Objects.equals(update_data, goods.update_data) && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, create_data, update_data, order_id, name, count, price_per_item, pack_amount, nds_amount, summ_amount);
    }
}
