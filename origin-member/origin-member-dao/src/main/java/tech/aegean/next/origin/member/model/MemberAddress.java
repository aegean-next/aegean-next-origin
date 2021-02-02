/*
 * Copyright (c) 2021. Aegean Next OpenSource FrameWork
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 * ----- ----- ----- ----- -----
 *
 * Visit the project homepage for more information at https://next.aegean.tech,
 * Or see the code warehouse at https://github.com/aegean-next, https://gitee.com/aegean-next.
 */

package tech.aegean.next.origin.member.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

@Data
@Builder
@TableName("t_member_address")
public class MemberAddress {

    /** PK **/
    @TableId(type = IdType.AUTO)
    private BigInteger id;

    // ----- ----- ID ----- -----

    /** 国家 **/
    @TableField
    private BigInteger countryId;

    /** 省份 **/
    @TableField
    private BigInteger provinceId;

    /** 城市 **/
    @TableField
    private BigInteger cityId;

    /** 地区 **/
    @TableField
    private BigInteger districtId;

    // ----- ----- CODE 编码----- -----

    /** 国家 **/
    @TableField
    private String countryCode;

    /** 省份 **/
    @TableField
    private String provinceCode;

    /** 城市 **/
    @TableField
    private String cityCode;

    /** 地区 **/
    @TableField
    private String districtCode;

    // ----- ----- 扩展信息 ----- -----

    /** 详细地址（除国家、省市区外） **/
    @TableField
    private String address;

    /** 排序 **/
    @TableField
    private Integer sort;

    /** 标签 **/
    @TableField
    private String tag;

    // ----- ----- 基础信息 ----- -----

    /**
     * 状态 0-删除 1-有效
     * 为了避免代码冗余，订单地址关联会员地址
     * 由于可能存在会员下单后删除地址的情况，当会员地址和订单有关联时不做物理删除
     */
    @TableField
    private Integer status;

    /** 创建时间 **/
    @TableField
    private Date createTime;

    /** 更新时间 **/
    @TableField
    private Date updateTime;


}
