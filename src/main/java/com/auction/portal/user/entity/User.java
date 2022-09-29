package com.auction.portal.user.entity;

import com.auction.portal.auction.entity.Auction;
import com.auction.portal.bid.entity.Bid;
import com.auction.portal.common.entity.CommonEntity;
import com.auction.portal.country.entity.Country;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User extends CommonEntity {

    @Email(regexp = "^[A-Z0-9+_.-]+@[A-Z0-9.-]+$")
    @Column(unique = true)
    private String email;

    @Column(name = "user_name")
    private String userName;

    private String password;

    private String role;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "country_id" , referencedColumnName = "id")
    private Country country;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<Auction> auctions;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private List<Bid> bids;




}
