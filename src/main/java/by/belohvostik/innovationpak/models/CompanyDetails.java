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
@Table(name = "companydetails")
@ToString
@RequiredArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CompanyDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "account")
    private String account;
    @Column(name = "bank_name")
    private String bank_name;
    @Column(name = "bank_bik")
    private String bank_bik;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyDetails)) return false;
        CompanyDetails that = (CompanyDetails) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(account, that.account) && Objects.equals(bank_name, that.bank_name) && Objects.equals(bank_bik, that.bank_bik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, account, bank_name, bank_bik);
    }
}
