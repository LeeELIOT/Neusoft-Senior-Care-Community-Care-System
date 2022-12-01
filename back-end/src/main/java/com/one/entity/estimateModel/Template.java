package com.one.entity.estimateModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Template implements Serializable {
    private Integer id;
    private String name;
    private Integer etId;

    private ETemplateType templateType;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;


}
