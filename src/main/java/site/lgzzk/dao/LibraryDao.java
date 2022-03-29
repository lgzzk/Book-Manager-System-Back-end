package site.lgzzk.dao;

import site.lgzzk.entity.Library;

/**
 * (Library)表数据库访问层
 *
 * @author lgzzk
 * @since 2022-03-18 15:54:39
 */
public interface LibraryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Library queryById(Integer id);

    /**
     * 修改数据
     *
     * @param library 实例对象
     * @return 影响行数
     */
    int update(Library library);

}

