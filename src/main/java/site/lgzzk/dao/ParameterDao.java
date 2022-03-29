package site.lgzzk.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import site.lgzzk.entity.Parameter;

/**
 * (TbParameter)表数据库访问层
 *
 * @author lgzzk
 * @since 2022-03-19 21:35:46
 */
public interface ParameterDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Parameter queryById(Integer id);


    /**
     * 修改数据
     *
     * @param parameter 实例对象
     * @return 影响行数
     */
    @Transactional(propagation = Propagation.MANDATORY)
    int update(Parameter parameter);


}

