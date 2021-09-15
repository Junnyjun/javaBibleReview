import java.text.MessageFormat;

class Scratch {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1}";

        Object[] arguments = {
                "이름","010-123-1234"
        };

        String result = MessageFormat.format(msg,arguments);
        System.out.println(result);
    }
}