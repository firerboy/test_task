package com.tutor.yepp.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name_recipient;
    private String type;
    private String index_recipient;
    private String address_recipient;
    private String status;

    @OneToMany(mappedBy = "shipment", orphanRemoval = true)
    private List<ShipmentHistory> history = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName_recipient() {
        return name_recipient;
    }

    public void setName_recipient(String name_recipient) {
        this.name_recipient = name_recipient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndex_recipient() {
        return index_recipient;
    }

    public void setIndex_recipient(String index_recipient) {
        this.index_recipient = index_recipient;
    }

    public String getAddress_recipient() {
        return address_recipient;
    }

    public void setAddress_recipient(String address_recipient) {
        this.address_recipient = address_recipient;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ShipmentHistory> getHistory() {
        return history;
    }

    public void setHistory(List<ShipmentHistory> history) {
        this.history = history;
    }
}
