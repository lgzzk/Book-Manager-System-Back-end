package site.lgzzk.dao;

import org.junit.Test;
import site.lgzzk.BaseTest;
import site.lgzzk.entity.Parameter;
import site.lgzzk.service.ParameterService;

import javax.annotation.Resource;

public class ParameterDaoTest extends BaseTest {

    @Resource
    ParameterDao parameterDao;
    @Resource
    ParameterService parameterService;

    @Test
    public void testQueryById() {
        parameterService.queryById(1);
    }

    @Test
//    @Transactional(propagation = Propagation.REQUIRED)
    public void update() {
        Parameter parameter = new Parameter();
        parameter.setId(1);
        parameter.setCost(30);
        parameter.setValidity(60);
        parameterService.update(parameter);
    }
}