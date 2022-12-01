package com.one.entity.bedModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/*大楼信息*/
public class Block implements Serializable {

    private Integer id;
    private String name;
    private Integer maxFloor;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
