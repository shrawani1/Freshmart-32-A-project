/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class CategoryV2 {
    private int cat_id;
    private String cat_name;
    private String desc;

    public CategoryV2(int cat_id, String cat_name, String desc) {
        this.cat_id = cat_id;
        this.cat_name = cat_name;
        this.desc = desc;
    }

    public int getCat_id() {
        return this.cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return this.cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
