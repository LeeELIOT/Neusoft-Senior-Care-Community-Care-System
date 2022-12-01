package com.one.entity.staffModel;

import com.one.entity.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class StaffType extends Type implements Serializable {
    private Integer id;
    private String name;

    private String createBy;
    private String createDate;
    private String updateBy;
    private String updateDate;
    private String remarks;
    private Integer delFlag;
}
