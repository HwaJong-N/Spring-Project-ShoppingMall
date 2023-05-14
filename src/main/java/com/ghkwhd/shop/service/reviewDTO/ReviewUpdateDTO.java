package com.ghkwhd.shop.service.reviewDTO;

import com.ghkwhd.shop.domain.item.Item;
import lombok.Data;

@Data
public class ReviewUpdateDTO {

    private Long id;
    private Long itemId;
    private Integer star;
    private String nickname;
    private String comment;
}
