package com.linjun.dao;

import com.linjun.model.GoodsImage;
import com.linjun.model.GoodsImageCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsImageMapper {
    long countByExample(GoodsImageCriteria example);

    int deleteByExample(GoodsImageCriteria example);

    int deleteByPrimaryKey(Long id);

    int insert(GoodsImage record);

    int insertSelective(GoodsImage record);

    List<GoodsImage> selectByExample(GoodsImageCriteria example);

    GoodsImage selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") GoodsImage record, @Param("example") GoodsImageCriteria example);

    int updateByExample(@Param("record") GoodsImage record, @Param("example") GoodsImageCriteria example);

    int updateByPrimaryKeySelective(GoodsImage record);

    int updateByPrimaryKey(GoodsImage record);
}