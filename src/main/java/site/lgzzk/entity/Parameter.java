package site.lgzzk.entity;

import java.io.Serializable;

/**
 * (TbParameter)实体类
 *
 * @author lgzzk
 * @since 2022-03-19 21:35:48
 */
public class Parameter implements Serializable {
    private static final long serialVersionUID = 603688894368921404L;

    private Integer id;

    private Integer cost;

    private Integer validity;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

}

