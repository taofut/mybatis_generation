package com.ft.book.mapper;

import com.ft.book.bean.ReaderInfo;
import com.ft.book.bean.ReaderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderInfoMapper {
    int deleteByExample(ReaderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReaderInfo record);

    int insertSelective(ReaderInfo record);

    List<ReaderInfo> selectByExample(ReaderInfoExample example);

    ReaderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReaderInfo record, @Param("example") ReaderInfoExample example);

    int updateByExample(@Param("record") ReaderInfo record, @Param("example") ReaderInfoExample example);

    int updateByPrimaryKeySelective(ReaderInfo record);

    int updateByPrimaryKey(ReaderInfo record);
}