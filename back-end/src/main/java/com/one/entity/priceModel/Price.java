package com.one.entity.priceModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Price {

    private Integer id;
    private String writeStaff;
    private Integer priceTypeId;
    /*钱数*/
    private Integer account;

    private PriceType priceType;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
