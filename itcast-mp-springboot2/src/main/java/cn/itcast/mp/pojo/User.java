package cn.itcast.mp.pojo;

import cn.itcast.mp.enums.SexEnum;
import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@TableName("tb_user")
//@KeySequence(value = "SEQ_USER", clazz = Long.class)
public class User extends Model<User> {

//    @TableId(type = IdType.AUTO)
    private Long id;
    private String userName;

    // 插入数据时进行填充
    @TableField(select = false, fill = FieldFill.INSERT) //查询时不返回该字段的值
    private String password;
    private String name;
    private Integer age;

    @TableField(value = "email") //指定数据表中字段名
    private String mail;

    @TableField(exist = false)
    private String address; //在数据库表中是不存在的

    @Version //乐观锁的版本字段
    private Integer version;

    @TableLogic // 逻辑删除字段 ，1-删除，0-未删除
    private Integer deleted;

    private SexEnum sex; //性别，枚举类型

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", version=" + version +
                ", deleted=" + deleted +
                ", sex=" + sex +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getMail() {
        return mail;
    }

    public String getAddress() {
        return address;
    }

    public Integer getVersion() {
        return version;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public SexEnum getSex() {
        return sex;
    }
}