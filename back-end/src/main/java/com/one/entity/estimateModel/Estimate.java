package com.one.entity.estimateModel;

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
/*评估日志*/
public class Estimate implements Serializable {
    private Integer id;
    private Integer oldId;
    private Integer templateId;
    private String createTime;
    private String endTime;
    private String result;

    private Template template;
    private Old old;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
