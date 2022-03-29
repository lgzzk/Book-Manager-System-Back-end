package site.lgzzk.entity;

import java.io.Serializable;

/**
 * (TbLibrary)实体类
 *
 * @author lgzzk
 * @since 2022-03-18 15:54:40
 */
public class Library implements Serializable {
    private static final long serialVersionUID = 383193667989603532L;

    private Integer id;

    private String libraryName;

    private String curator;

    private String tel;

    private String address;

    private String email;

    private String url;

    private String createDate;

    private String introduce;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    @Override
    public String toString() {
        return "TbLibrary{" +
                "id=" + id +
                ", libraryName='" + libraryName + '\'' +
                ", curator='" + curator + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", url='" + url + '\'' +
                ", createDate=" + createDate +
                ", introduce='" + introduce + '\'' +
                '}';
    }
}

