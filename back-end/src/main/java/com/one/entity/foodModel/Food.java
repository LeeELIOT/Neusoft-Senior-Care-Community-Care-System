package com.one.entity.foodModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/*食物*/
public class Food {
    private Integer id;
    private String name;
    private String picture;
    private Integer price;
    private Integer tasteId;
    private String eatTime;

    private Taste taste;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
