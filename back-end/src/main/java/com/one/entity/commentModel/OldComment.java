package com.one.entity.commentModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class OldComment implements Serializable {

    private Integer id;
    private Integer oldId;
    private Integer status;
    private String advise;
    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}

