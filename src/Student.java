public class Student {
    private String name;
    private int age;
    private String email;
    private long phonNumber;

    public Student(String name, int age, String email, long phonNumber) {
        this.name = name;
        this.age = age;
        this.phonNumber = phonNumber;
        if(email.contains("@")){
            this.email=email;

        }else {
            System.out.println(" sosuz jaz");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhonNumber() {
        return phonNumber;
    }

    public void setPhonNumber(long phonNumber) {
        this.phonNumber = phonNumber;
    }

    @Override
    public String
    toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phonNumber=" + phonNumber +
                '}';
    }
}



