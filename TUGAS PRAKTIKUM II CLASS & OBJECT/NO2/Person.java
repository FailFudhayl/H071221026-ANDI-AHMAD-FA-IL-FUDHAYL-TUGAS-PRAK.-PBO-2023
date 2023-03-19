public class Person {
    // deklarasikan atribute
    String name;
    int age;
    boolean isMale;

    // buat method setter dan getter
    public void setName(String namanya) {
        name = namanya;
    }

    String getName() {
        return name;
    }

    public void setAge(int umurnya) {
        age = umurnya;
    }

    int getAge() {
        return age;
    }

    public void setGender(boolean gendernya) {
        isMale = gendernya;
    }

    String getGender() {
        if (isMale) {
            return "laki laki";
        } else {
            return "perempuan";
        }
    }
}
