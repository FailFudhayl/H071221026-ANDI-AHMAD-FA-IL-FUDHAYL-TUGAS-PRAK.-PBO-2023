package models;

public class Profile {
    /*
     * Tambahkan attribute, method, atau constructor
     * yang dibutuhkan di kelas user
     */
    private String name;
    private String nickName;
    private int age;
    private String hobby;

    // public Profile(String name, String nickName, int age, String hobby) {
    // this.name = name;
    // this.nickName = nickName;
    // this.age = age;
    // this.hobby = hobby;
    // }

    public Profile() {
    }

    public Profile(String name, String nickName, int age, String hobby) {
        this.name = name;
        this.nickName = nickName;
        this.age = age;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

}
