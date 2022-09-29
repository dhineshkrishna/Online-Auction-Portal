package com.auction.portal.auction.controller;

import com.auction.portal.auction.dto.AuctionDto;
import com.auction.portal.auction.entity.Auction;
import com.auction.portal.auction.repository.AuctionRepository;
import com.auction.portal.auction.service.AuctionService;
import com.auction.portal.utils.ErrorCodes;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
public class AuctionController {
    @Autowired
    AuctionRepository repo;

    @Autowired
    AuctionService auctionServ;

    @GetMapping("/")
    public List<AuctionDto> getAllAuctions(){
        return auctionServ.getAuctions();
    }
    @PostMapping("/add")
    public Auction postAuctions(@RequestBody Auction auctionDto){
        return auctionServ.postAuction(auctionDto);
    }
    @PutMapping("/update")
    public AuctionDto putAuctions(@RequestBody AuctionDto auctionDto){
        return auctionServ.putAuction(auctionDto);
    }
    @DeleteMapping("/delete")
    public String deleteAuction(@PathVariable("id") int id){
        return auctionServ.deleteAuction(id);
    }

}
