package com.auction.portal.auction.service;

import com.auction.portal.auction.dto.AuctionDto;
import com.auction.portal.auction.entity.Auction;

import java.util.List;

public interface AuctionService {
    public List<AuctionDto> getAuctions();
    public Auction postAuction(Auction auctionDto);
    public AuctionDto putAuction(AuctionDto auctionDto);
    public String deleteAuction(int id);
}
