
public class chicken {

    int egg;
    int egg1 = 0; //유정란
    int egg2 = 0; //황금알
    int egg3 = 0; //상한알


    public void spawn() {


        egg = (int) (Math.random() * 3 + 1);

        switch (egg) {

            case 1:
                egg1++;
                break;

            case 2:
                egg2++;
                break;
            case 3:
                egg3++;
                break;
        }
    }


    public void print() { // 알 확인하기
        System.out.println(" ");
        System.out.println("＃＃＃＃＃＃＃＃＃＃＃＃＃＃ ");
        System.out.println("     유정란 :" + egg1 + "개");
        System.out.println(" ");
        System.out.println("     황금알 :" + egg2 + "개");
        System.out.println(" ");
        System.out.println("     꽝  알 :" + egg3 + "개");
        System.out.println("＃＃＃＃＃＃＃＃＃＃＃＃＃＃ ");
        System.out.println(" ");
    }


}

