public class Lambda {
    private Integer ld;
    private String name;
    private Double slary1;
    private Integer age;

    public Lambda(Integer ld, String name, Double slary1, Integer age) {
        this.ld = ld;
        this.name = name;
        this.slary1 = slary1;
        this.age = age;
    }

    public Lambda() {
    }

    public Integer getLd() {
        return ld;
    }

    public void setLd(Integer ld) {
        this.ld = ld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSlary1() {
        return slary1;
    }

    public void setSlary1(Double slary1) {
        this.slary1 = slary1;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Lambda{" +
                "ld=" + ld +
                ", name='" + name + '\'' +
                ", slary1=" + slary1 +
                ", age=" + age +
                '}';
    }
}
