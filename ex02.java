public class ex02 {
    public static void main(String[] args) {
        // alt+shift+f 自動整理縮排
        int grade = 50;
        char type = 'm';
        if (grade >= 60 && type == 'm') {
            System.out.println("課程:" + type + "\n成績及格:" + grade);
        } else {
            System.out.println("課程錯誤或成績不及格");
        }
    }
}
