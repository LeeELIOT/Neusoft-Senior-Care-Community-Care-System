package com.one.entity.oldModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/*老人信息*/
public class Old implements Serializable {
    private Integer id;
    private String name;
    private Integer gender;
    private String identity;
    private Integer oldTypeId;
    private String relative;
    private String relativeTel;
    private String status;

    private OldType oldType;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
