package com.muchi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Author： yuzq
 * Description:
 * Date: 2020/2/5   12:03
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;
    private String db_source;

}
