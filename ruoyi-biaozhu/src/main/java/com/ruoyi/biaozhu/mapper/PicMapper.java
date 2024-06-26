package com.ruoyi.biaozhu.mapper;

import java.util.List;
import com.ruoyi.biaozhu.domain.Pic;

/**
 * 标注Mapper接口
 * 
 * @author ruoyi
 * @date 2024-04-29
 */
public interface PicMapper 
{
    /**
     * 查询标注
     * 
     * @param pId 标注主键
     * @return 标注
     */
    public Pic selectPicByPId(String pId);

    /**
     * 查询标注列表
     * 
     * @param pic 标注
     * @return 标注集合
     */
    public List<Pic> selectPicList(Pic pic);

    /**
     * 新增标注
     * 
     * @param pic 标注
     * @return 结果
     */
    public int insertPic(Pic pic);

    /**
     * 修改标注
     * 
     * @param pic 标注
     * @return 结果
     */
    public int updatePic(Pic pic);

    /**
     * 删除标注
     * 
     * @param pId 标注主键
     * @return 结果
     */
    public int deletePicByPId(String pId);

    /**
     * 批量删除标注
     * 
     * @param pIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePicByPIds(String[] pIds);

    //查找未标注的
    public List<Pic> selectUnlabeled(Pic pic);

    //批量插入
    public int insertPics(List<Pic> picList);

    //查找丢弃的
    public List<Pic> selectDiscard(Pic pic);

    //查找已标注的
    public List<Pic> selectLabeled(Pic pic);
}
