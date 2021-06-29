package com.jyu.service;

import com.jyu.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {

    //新增保存
    Type saveType(Type type);

    //新增查询
    Type getType(Long id);

    //查询重复
    Type getTypeByName(String name);

    //分页查询
    Page<Type> listType(Pageable pageable);

    List<Type> listType();

    List<Type> listTypeTop(Integer size);

    //修改
    Type updateType(Long id, Type type);

    //删除
    void deleteType(Long id);

}
