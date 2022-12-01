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
/*房间信息表*/
public class Room implements Serializable {
    private Integer id;
    private String name;
    private String roomType;
    private Integer blockId;
    private Integer floor;

    private Block block;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
