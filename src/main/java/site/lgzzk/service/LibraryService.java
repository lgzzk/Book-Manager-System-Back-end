package site.lgzzk.service;

import org.springframework.stereotype.Service;
import site.lgzzk.dao.LibraryDao;
import site.lgzzk.entity.Library;

import javax.annotation.Resource;

/**
 * (Library)表服务接口
 *
 * @author lgzzk
 * @since 2022-03-18 15:54:41
 */
@Service
public class LibraryService {

    @Resource
    LibraryDao libraryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Library queryById(Integer id){
        return libraryDao.queryById(id);
    }

    /**
     * 修改数据
     *
     * @param library 实例对象
     * @return 实例对象
     */
    public int update(Library library){
        int update = libraryDao.update(library);
        return update;
    }

}
