package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "goods")
@RequiredArgsConstructor
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private  Timestamp create_data;
    private  Timestamp update_data;
    private  int order_id;
    private  String name;
    private  int count;
    private  float price_per_item;
    private  float pack_amount;
    private  float nds_amount;
    private  float summ_amount;

    public Goods(@JsonProperty("id") int id,
                 @JsonProperty("create_data") Timestamp create_data,
                 @JsonProperty("update_data") Timestamp update_data,
                 @JsonProperty("order_id") int order_id,
                 @JsonProperty("name") String name,
                 @JsonProperty("count") int count,
                 @JsonProperty("price_per_item") float price_per_item,
                 @JsonProperty("pack_amount") float pack_amount,
                 @JsonProperty("nds_amount") float nds_amount,
                 @JsonProperty("summ_amount") float summ_amount) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.order_id = order_id;
        this.name = name;
        this.count = count;
        this.price_per_item = price_per_item;
        this.pack_amount = pack_amount;
        this.nds_amount = nds_amount;
        this.summ_amount = summ_amount;
    }
}
