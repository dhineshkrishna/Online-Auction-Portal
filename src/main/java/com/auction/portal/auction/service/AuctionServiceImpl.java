package com.auction.portal.auction.service;

import com.auction.portal.auction.dto.AuctionDto;
import com.auction.portal.auction.entity.Auction;
import com.auction.portal.auction.repository.AuctionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuctionServiceImpl implements AuctionService{
    @Autowired
    private AuctionRepository auctionRepo;
    @Autowired
    private ModelMapper modelmapper;

    @Override
    public List<AuctionDto> getAuctions() {
        List<Auction> auctions =auctionRepo.findAll();
        return auctions.stream().map(auction1 -> modelmapper.map(auction1,AuctionDto.class)).collect(Collectors.toList());
    }

    @Override
    public Auction postAuction(Auction auctionDto) {
        return auctionRepo.save(auctionDto);
        }

    @Override
    public AuctionDto putAuction(AuctionDto auctionDto) {
        return null;
    }

    @Override
    public String deleteAuction(int id) {
        Optional<Auction> auctions =auctionRepo.findById(id);
        return null;
    }
}
