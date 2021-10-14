package by.belohvostik.innovationpak.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "company_details")
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String account;
    private String bank_name;
    private String bank_bik;

}
