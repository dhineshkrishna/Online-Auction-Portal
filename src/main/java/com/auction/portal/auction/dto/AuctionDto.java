package com.auction.portal.auction.dto;

import com.auction.portal.bid.entity.Bid;
import com.auction.portal.common.dto.CommonDto;
import com.auction.portal.product.entity.Product;
import com.auction.portal.user.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class AuctionDto extends CommonDto implements Comparable<AuctionDto> {

    private Long minPrice;

    private LocalDateTime expiryDate;

    private boolean isOpen;

    private boolean isSold;

    private boolean isExpired;

    private Product product;

    private User user;

    private List<Bid> bids;

    @Override
    public int compareTo(AuctionDto o) {
        if (this.getExpiryDate().isBefore(o.getExpiryDate())) return 1;
        else if (this.getExpiryDate().isAfter(o.getExpiryDate())) return -1;
        else return 0;
    }
}
