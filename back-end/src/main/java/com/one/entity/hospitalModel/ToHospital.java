package com.one.entity.hospitalModel;

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
public class ToHospital implements Serializable {
    private Integer id;
    private Integer oldId;
    private String hospital;
    private String doctor;
    private String result;

    private Old old;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
