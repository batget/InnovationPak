package by.belohvostik.innovationpak.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "company_details")
@RequiredArgsConstructor
public class CompanyDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String account;
    private String bank_name;
    private String bank_bik;

    public CompanyDetails(
            @JsonProperty("id") Long id,
            @JsonProperty("name") String name,
            @JsonProperty("address") String address,
            @JsonProperty("account") String account,
            @JsonProperty("bank_name") String bank_name,
            @JsonProperty("bank_bik") String bank_bik) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.account = account;
        this.bank_name = bank_name;
        this.bank_bik = bank_bik;
    }

}
