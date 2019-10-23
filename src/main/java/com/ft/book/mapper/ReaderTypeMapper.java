package com.ft.book.mapper;

import com.ft.book.bean.ReaderType;
import com.ft.book.bean.ReaderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReaderTypeMapper {
    int deleteByExample(ReaderTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ReaderType record);

    int insertSelective(ReaderType record);

    List<ReaderType> selectByExample(ReaderTypeExample example);

    ReaderType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByExample(@Param("record") ReaderType record, @Param("example") ReaderTypeExample example);

    int updateByPrimaryKeySelective(ReaderType record);

    int updateByPrimaryKey(ReaderType record);
}