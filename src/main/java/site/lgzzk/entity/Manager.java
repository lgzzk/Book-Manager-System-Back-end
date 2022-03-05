package site.lgzzk.entity;

import java.io.Serializable;

/**
 * (Manager)实体类
 *
 * @author lgzzk
 * @since 2022-03-05 13:40:15
 */
public class Manager implements Serializable {
    private static final long serialVersionUID = -16745594301941325L;
    
    private Integer id;
    
    private String name;
    
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

