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
@Table(name = "contract_sos")
@RequiredArgsConstructor
public class ContractSos {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Timestamp create_data;
    private Timestamp update_data;
    private String contact_number;
    private int customer_id;
    private Timestamp start_date;
    private Timestamp end_date;

    public ContractSos(@JsonProperty("id") int id,
                       @JsonProperty("create_data") Timestamp create_data,
                       @JsonProperty("update_data") Timestamp update_data,
                       @JsonProperty("contract_number") String contact_number,
                       @JsonProperty("customer_id") int customer_id,
                       @JsonProperty("start_date") Timestamp start_date,
                       @JsonProperty("end_date") Timestamp end_date) {
        this.id = id;
        this.create_data = create_data;
        this.update_data = update_data;
        this.contact_number = contact_number;
        this.customer_id = customer_id;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}