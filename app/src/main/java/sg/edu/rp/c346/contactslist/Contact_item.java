package sg.edu.rp.c346.contactslist;

/**
 * Created by 17010564 on 24/7/2018.
 */

public class Contact_item {

    private String name;
    private String num1;
    private Integer num2;

    public Contact_item(String name, String num1, Integer num2) {
        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
}
