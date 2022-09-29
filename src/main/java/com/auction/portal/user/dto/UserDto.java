package com.auction.portal.user.dto;

import com.auction.portal.auction.entity.Auction;
import com.auction.portal.bid.entity.Bid;
import com.auction.portal.common.dto.CommonDto;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto extends CommonDto {

    private String email;

    private String userName;

    private String password;

    private String role;

    private String countryName;

    private String currencyCode;

    private List<Auction> auctions;

    private List<Bid> bids;
}
