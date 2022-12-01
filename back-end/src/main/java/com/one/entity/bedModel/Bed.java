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
/*床位管理*/
public class Bed implements Serializable {

    private Integer id;
    private Integer name;
    private Integer roomId;
    private String bedStatus;

    private Room room;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
