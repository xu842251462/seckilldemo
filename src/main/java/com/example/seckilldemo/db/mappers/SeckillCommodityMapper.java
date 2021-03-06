package com.example.seckilldemo.db.mappers;

import com.jiuzhang.seckill.db.po.SeckillCommodity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SeckillCommodityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SeckillCommodity record);

    int insertSelective(SeckillCommodity record);

    SeckillCommodity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillCommodity record);

    int updateByPrimaryKey(SeckillCommodity record);
}