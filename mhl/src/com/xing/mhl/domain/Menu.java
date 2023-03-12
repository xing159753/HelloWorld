package com.xing.mhl.domain;

/**
 * 该类（javabean)和menu表对应
 * id INT PRIMARY KEY AUTO_INCREMENT,#自增主键，作为菜谱编号(唯一)
 * 	`name` VARCHAR(50) NOT NULL DEFAULT '',#菜品名称
 * 	TYPE VARCHAR(50) NOT NULL DEFAULT '',#菜品种类
 * 	price DOUBLE NOT NULL DEFAULT 0#价格
 */
public class Menu {
    private Integer id;
    private String name;
    private String type;
    private Double price;

    public Menu() {//无参构造器
    }

    public Menu(Integer id, String name, String type, Double price) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.price = price;
    }

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "\t\t\t" + name + "\t\t" + type + "\t\t" + price;
    }
}
