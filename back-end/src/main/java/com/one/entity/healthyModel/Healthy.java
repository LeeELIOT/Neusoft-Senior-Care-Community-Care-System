package com.one.entity.healthyModel;

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
public class Healthy implements Serializable {
    private Integer id;
    private Integer oldId;
    private String height;
    private String weight;
    private String blood;
    private String lastDisease;
    private String nowDisease;
    private String homeDisease;
    private String bloodPressure;

    private Old old;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
