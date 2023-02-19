public class Itate {
     int num;  // from main
    private String a = "winter";
    private String b = "spring";
    private String c = "summer";
    private String d = "autumn";

    public void setNum(int num){
        this.num = num;
    }
    public int getNum() {

        if (num < 3 || num == 12) {
            System.out.println(a);
        } else if (num == 3 || num < 6) {
            System.out.println(b);
        } else if (num == 6 || num < 9) {
            System.out.println(c);
        } else if (num == 9 || num < 12) {
            System.out.println(c);
        } else {
            System.out.println("It is not right number");
        }
        return num;
    }

}
