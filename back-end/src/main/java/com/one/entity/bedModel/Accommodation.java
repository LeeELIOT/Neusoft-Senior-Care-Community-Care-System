package com.one.entity.bedModel;

import com.one.entity.oldModel.Old;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/*入住信息表*/
public class Accommodation implements Serializable {
    private Integer id;
    private Integer oldId;
    private Integer bedId;
    private String inTime;
    private String outTime;

    private Old old;
    private Bed bed;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
