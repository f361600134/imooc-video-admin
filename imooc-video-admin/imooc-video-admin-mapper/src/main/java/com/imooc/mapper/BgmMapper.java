package com.imooc.mapper;

import com.imooc.pojo.Bgm;
import com.imooc.pojo.BgmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 提交测试
 * @Description 
 * @author Jeremy
 * @date 2018年10月2日 下午10:32:07 
 * @version V1.0
 */
public interface BgmMapper {
    int countByExample(BgmExample example);

    int deleteByExample(BgmExample example);

    int deleteByPrimaryKey(String id);

    int insert(Bgm record);

    int insertSelective(Bgm record);

    List<Bgm> selectByExample(BgmExample example);

    Bgm selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Bgm record, @Param("example") BgmExample example);

    int updateByExample(@Param("record") Bgm record, @Param("example") BgmExample example);

    int updateByPrimaryKeySelective(Bgm record);

    int updateByPrimaryKey(Bgm record);
}