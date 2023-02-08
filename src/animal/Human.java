package animal;

import animal.Thinkable;

public class Human extends Animal implements Thinkable {

    //フィールド
    private String hoby; //趣味

    public Human() {
    }

    public Human(String name, int age, String hoby) {
        super(name, age);
        this.hoby = hoby;

    }

    public String getHoby() {
        return hoby;
    }

    public void setHoby(String hoby) {
        this.hoby = hoby;
    }

    @Override //必要？import thinkable使ってない、の表示はなぜか要確認
    public void think() {
        System.out.println("私は"+ getHoby() + "について考えています。");
    }





}
