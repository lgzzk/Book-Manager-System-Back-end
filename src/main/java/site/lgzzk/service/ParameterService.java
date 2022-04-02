package site.lgzzk.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import site.lgzzk.dao.ParameterDao;
import site.lgzzk.entity.Parameter;

import javax.annotation.Resource;

/**
 * (Parameter)表服务接口
 *
 * @author lgzzk
 * @since 2022-03-19 21:41:37
 */
@Service
public class ParameterService {

    @Resource
    ParameterDao parameterDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Parameter queryById(Integer id) {
        return parameterDao.queryById(id);
    }


    /**
     * 修改数据
     *
     * @param parameter 实例对象
     * @return 实例对象
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public int update(Parameter parameter) {
        int update = parameterDao.update(parameter);
        return update;
    }


}
