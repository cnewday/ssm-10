package com.lutongnet.base.mapper;


/**
 * 数据操作层接口类
 * @author heqiuying
 * @param <T>
 * @since 2014-3-20 新建
 */
public interface BaseMapper <T>{
	
    /**
     * 新增记录方法
     * @param record
     * @return
     */
    int insert(T record);
    
    
    /**
     * 根据主键删除记录
     * @param key
     * @return
     */
    <K> int delete(K key);
    
    /**
     * 根据主键更新记录
     * @param record
     * @return
     */
    int update(T record);
    
    /**
     * 根据主键查询记录
     * @param key
     * @return
     */
    <K> T select(K key);
}
