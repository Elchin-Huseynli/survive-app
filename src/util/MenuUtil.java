package util;

public class MenuUtil {
    public byte entry() {
        System.out.println(
                "\n[1]. Eat meat (10%)" +
                "\n[2]. Drink milk (8%)" +
                "\n[3]. Show energy\n"
        );
        return InputUtil.inputTypeByte("Option: ");
    }
}
