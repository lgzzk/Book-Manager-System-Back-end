package site.lgzzk.dao;

import org.junit.Test;
import site.lgzzk.BaseTest;
import site.lgzzk.entity.Library;

import javax.annotation.Resource;

public class LibraryDaoTest extends BaseTest {

    @Resource
    LibraryDao libraryDao;

    @Test
    public void testQueryById() {
        Library library = libraryDao.queryById(1);
        System.out.println(library);
    }

    @Test
    public void testUpdateById() {

    }
}