package com.auction.portal.auction.entity;

import com.auction.portal.bid.entity.Bid;
import com.auction.portal.common.entity.CommonEntity;
import com.auction.portal.product.entity.Product;
import com.auction.portal.user.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "auction")
@Getter
@Setter
public class Auction extends CommonEntity {

    @Column(name = "min_price")
    private Long minPrice;

    @Column(name = "expiry_date")
    private LocalDateTime expiryDate;

    @Column(name = "is_open")
    private boolean isOpen = true;

    @Column(name = "is_sold")
    private boolean isSold;

    @Column(name = "is_expired")
    private boolean isExpired;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.DETACH)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinColumn(name = "auction_id", referencedColumnName = "id")
    private List<Bid> bids;

}
