package com.sms.security.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name="all_ip")
public class IpAll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rest_adress")
    private String restAdress;

    @Column(name = "ip")
    private String ip;

    public IpAll(String restAdress, String ip) {
        this.restAdress = restAdress;
        this.ip = ip;
    }
}
