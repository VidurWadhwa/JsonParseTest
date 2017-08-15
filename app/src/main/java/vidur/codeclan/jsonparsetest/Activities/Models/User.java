package vidur.codeclan.jsonparsetest.Activities.Models;

/**
 * Created by vidur on 8/14/2017.
 */

public class User {

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", authority='" + authority + '\'' +
                ", level='" + level + '\'' +
                ", post='" + post + '\'' +
                ", image_link='" + image_link + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", teacher='" + teacher + '\'' +
                ", hideid='" + hideid + '\'' +
                ", first_login_datetime='" + first_login_datetime + '\'' +
                ", last_login_datetime='" + last_login_datetime + '\'' +
                ", last_login_ip='" + last_login_ip + '\'' +
                '}';
    }

    /**
     * id : ASee567b292e
     * name : Gaurisha
     * authority : 2
     * level : Advance
     * post : Admin
     * image_link : http://www.arraystack.com/as9mobile/avatar.png
     * username : gau
     * password : hh
     * phone : 969
     * email : bzbx
     * teacher : 1
     * hideid : 1
     * first_login_datetime : 2017-05-03 14:46:12
     * last_login_datetime : 2017-05-03 14:46:12
     * last_login_ip : 115.97.126.17
     */

    private String id;
    private String name;
    private String authority;
    private String level;
    private String post;
    private String image_link;
    private String username;
    private String password;
    private String phone;
    private String email;
    private String teacher;
    private String hideid;
    private String first_login_datetime;
    private String last_login_datetime;
    private String last_login_ip;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setHideid(String hideid) {
        this.hideid = hideid;
    }

    public void setFirst_login_datetime(String first_login_datetime) {
        this.first_login_datetime = first_login_datetime;
    }

    public void setLast_login_datetime(String last_login_datetime) {
        this.last_login_datetime = last_login_datetime;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthority() {
        return authority;
    }

    public String getLevel() {
        return level;
    }

    public String getPost() {
        return post;
    }

    public String getImage_link() {
        return image_link;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTeacher() {
        return teacher;
    }

    public String getHideid() {
        return hideid;
    }

    public String getFirst_login_datetime() {
        return first_login_datetime;
    }

    public String getLast_login_datetime() {
        return last_login_datetime;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }
}
