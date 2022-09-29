package com.auction.portal.bid.dto;

import com.auction.portal.auction.entity.Auction;
import com.auction.portal.common.dto.CommonDto;
import com.auction.portal.user.entity.User;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BidDto extends CommonDto {

    private Long bidValue;

    private boolean isWinner;

    private User user;

    private Auction auction;

}
