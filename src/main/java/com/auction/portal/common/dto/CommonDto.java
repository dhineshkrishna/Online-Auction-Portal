package com.auction.portal.common.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class CommonDto {

    private int id;

    private LocalDateTime deletedAt;
}
