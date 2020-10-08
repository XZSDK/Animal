public class Animal {
    private String num;
    private String type;
    private String sex;
    private String age;
    private String tail="NULL";
    private String leg="NULL";
    private String wing="NULL";
    private String fin="NULL";
    public Animal() {
    }
    public Animal(String type,String sex,String age,String tail,String leg,String wing,String fin){
        this.type=type;
        this.sex=sex;
        this.age=age;
        this.tail=tail;
        this.leg=leg;
        this.wing=wing;
        this.fin=fin;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
    public String getType() {
        return type;
    }

    public String getSex() {
        return sex;
    }

    public String getAge() {
        return age;
    }

    public String getFin() {
        return fin;
    }

    public String getLeg() {
        return leg;
    }

    public String getTail() {
        return tail;
    }

    public String getWing() {
        return wing;
    }
}
