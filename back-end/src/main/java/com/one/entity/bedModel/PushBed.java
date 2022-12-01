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
/*退住*/
public class PushBed implements Serializable {

    private Integer id;
    private Integer oldId;
    private String inTime;
    private String outTime;
    private String type;
    private String reason;
    private String status;

    private Old old;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;

}
