package animal;

public class Animal {

    //フィールド
    private String name; //名前
    private int age;     //年齢

    public Animal() {
    }

    public Animal(String name, int age) {
        //System.out.println("コンストラクタ　初期化");
        this.name = name;
        this.age = age;
    }


   String getName() {
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

    //say
    public void say() {
        System.out.println(getName()+ "です。" + getAge() + "歳です。");
    }



}
