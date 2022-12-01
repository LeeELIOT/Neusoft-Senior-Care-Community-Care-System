package com.one.entity.staffModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
/*员工工作描述*/
public class Job implements Serializable {

    private Integer id;
    private Integer staffId;
    private String jobRemark;
    private String inTime;
    private String outTime;

    private Staff staff;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;

}
