public class Situation extends Banghak{

    public void Situation1() { //사생결단1

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[사소하지만 인생에서 중요한 순간일 것 같은 퀘스쳔~1]");
        System.out.println("");
        System.out.println("○ 방학 D"+day+" 아 침 ○ ");
        System.out.println();
        System.out.println("TV에서 아프리카 우물을 위한 기부금을 광고한다. 물이 없어서 죽어가는 현지인들의 모습이 보인다  ");
        System.out.println("3만원이면 그들의 목마름을 해결 할 수 있다..현재 통장 잔고를 본다.. ");
        System.out.println();
        System.out.println("현재 통장 잔액 " +money+"원");
        System.out.println();
        System.out.println("1. 잔액이 이거 밖에 안되네.. 내가 도우긴 누굴 도와 등록금 모으기 바쁜데!!!");
        System.out.println();
        System.out.println("2. 잔액이 이거나 있네? 그래도 나는 따뜻한데서 밥도 먹고 잠도 잘수 있으니.. 도와줘야 겠다!  ");
        System.out.println();

        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println();
                System.out.println(" 내가 다음에 돈 많~이 벌면 기부도 많~이 할게~!  ");
                point+=100;
                break;


            case "2":
                System.out.println();
                System.out.println("잔고는 별로 안남았지만.. 하루 더 열심히 일하면 금방 버는건데 뭘! 힘내자!   ");
                System.out.println();
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("기부로 3만원이 차감되었습니다 더 열심히 일해야 한다는 부담감에 스트레스 20이 올라갑니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                point += 1;
                money-=30000;
                stress += 20;
                break;
        }
    }

    public void Situation2() { //
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[사소하지만 인생에서 중요한 순간일 것 같은 퀘스쳔~2]");
        System.out.println("");
        System.out.println("○방학 D"+day+" 아 침 ○ ");
        System.out.println("");
        System.out.println("[엄마] 슈퍼가서 콩나물 좀 사와!!!!");
        System.out.println("");
        System.out.println("슈퍼에 앞에 서성이던 노숙자를 보게 된다... 냄새가 엄청나게 심하게 난다.. ");
        System.out.println("");
        System.out.println("[노숙자] 학생.. 며칠동안 굶어서.. 오천원이라도 줄 수 있나...?  ");
        System.out.println("");
        System.out.println("1. '많이 힘드신거같아.. 나라도 도울 수 있다면...'");
        System.out.println("    오천원이요..? 만원 드릴게요.. 일단 밥이라도 따뜻한거 사 드세요 !!  ");
        System.out.println();
        System.out.println("2. 제가 심부름 온거라서요.. 돈이 별로 없어요..!  ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        String scNum = sc.next();
        switch (scNum) {
            case "1":
                System.out.println();
                System.out.println("[노숙자] 흑.. 고마워 학생.. 따뜻한 걸 먹은지가 언젠지... 복 받을 거야.. ");
                System.out.println();
                System.out.println("아니에요 ㅎㅎ.. '돈 모으기 빠듯하지만.. ㅠㅠ 에휴.. 알바하면 되니까...' ");
                System.out.println();
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("10000원이 지출 되었습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");

                point +=1;
                money -=10000;
                break;


            case "2":
                point += 100;
                System.out.println();
                System.out.println("으 빨리 지나가자 냄새가 저기까지 나네.. ");

                break;
        }
    }
    public void Situation3 () { //
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[사소하지만 인생에서 중요한 순간일 것 같은 퀘스쳔~3]");
        System.out.println("");
        System.out.println("○방학 D"+day+"  아침 ○ ");
        System.out.println("");
        System.out.println("아침부터 두통이 있어 편의점으로 간다 ");
        System.out.println(" ");
        System.out.println("편의점에 초등학생 아이 두명이 있다  ");
        System.out.println();
        System.out.println("[작은아이] 오빠 배가 너무 고파... ");
        System.out.println("[큰아이] 복지카드에 돈이 3000원 밖에 안남았어... 김밥이랑 라면사서 나눠먹자..  ");
        System.out.println();
        System.out.println("1. 쑥쑥 커야할 성장기에 애들이 저런것밖에 못먹느다니.. ");
        System.out.println("얘들아! 내가 공짜 포인트를 받았는데 혹시 먹고 싶은거 있니?  ");
        System.out.println();
        System.out.println("2. 그래도 나라에서 돈도 받고.. 나도 차라리 그러고 싶다... ");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println();
                System.out.println("[아이들] 네 정말요? 우와! 저희 도시락이요..! ");
                System.out.println();
                System.out.println(" 그래! 그리고 혹시 나중에 꼭 필요할 때 꼭 써! 큰건 아니야..!");
                System.out.println("");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                System.out.println("현금 2만원과 도시락 비용 및 두통약을 사 총 30000원이 지출 됐습니다");
                System.out.println("아이들을 도와 기분이 좋지만 예상치 못한 지출로 스트레스 20이 증가했습니다");
                System.out.println("▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒");
                point +=1;
                money -=30000;
                stress+= 20;
                break;


            case "2":
                point += 100;
                System.out.println(" 두통약이나 빨리 사서 가야지 으 춥다~~ ");

                break;
        }
    }
    public void Situation4 () { //마지막!
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("[사소하지만 인생에서 중요한 순간일 것 같은 퀘스쳔~4]");
        System.out.println("");
        System.out.println("○방학 D"+day+" 점심 ○ ");
        System.out.println("");
        System.out.println("소화가 안되서 산책 하러 밖에 나갔다.");
        System.out.println(" ");
        System.out.println("웬 새끼 고양이가 길 한복판에서 계속 울고 있다 ");
        System.out.println("");
        System.out.println("가까이 가보니 아파보인다 ");

        System.out.println("1. 에휴 불쌍해라.. 그래도 고양이 병원에 데리고 가면 병원비가 얼만데...  ");
        System.out.println("   불쌍하지만 어쩔 수 없지..  ");
        System.out.println("");
        System.out.println("2. 지금 여기에 계속 냅두면 죽을 텐데...병원비.. 얼마 나올진 모르겠지만 일단 데리고 가보자");
        System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
        System.out.println("▶▶원하는 번호를 선택하시오◀◀");
        String scNum = sc.next();

        switch (scNum) {
            case "1":
                System.out.println();
                System.out.println("야...옹.....");

                break;

            case "2":
                point += 1;
                String[] name = new String[23];

                System.out.println("────────────────────────────────────────────────────────────────────────────────────────────────────────────");
                name[0] = ("웬일인지 다 닫혀있는 동물병원 ..  ");
                name[1] = ("");
                name[2] = ("야옹..");
                name[3] = ("");
                name[4] = ("어떡하니.. 널 치료해줄 병원이 다 닫았어... ! 흑.. 너무 아프지..");
                name[5] = ("");
                name[6] = ("흘린 눈물이 고양이에게 떨어졌다. ");
                name[7] = ("");
                name[8] = (" 슈르르륵 펑! ");
                name[9] = ("");
                name[10] = (" 고양이가 요정 할머니가 되고 그리고 뒤이어 노숙자, 아이들이 되었다");
                name[11] = ("");
                name[12] = ("[요정할머니]  그 동안 너의 선행을 봐왔단다...  넌 정말 마음이 선한 아이로구나");
                name[13] = ("");
                name[14] = ("네..??? 대체 누구세요???");
                name[15] = ("");
                name[16] = ("[요정할머니] 난 그동안 너를 지켜보던 요정이란다 마지막까지 작은 동물을 위해서 흘린 눈물은");
                name[17] = ("            정말 감동적이었어.. 너에게 선물을 하나 줄게 바로 황금알을 낳는 닭이란다. . ");
                name[18] = ("");
                name[19] = ("감...감사합니다.... 근데 그게 뭐예요???");
                name[20] = ("");
                name[21] = ("[요정할머니] 이 알들은 상점에 갈면 팔 수 있단다! 그럼 난 이만!~~~ ");
                name[22]=("────────────────────────────────────────────────────────────────────────────────────────────────────────────");



                for (String string : name) {

                    System.out.println(string);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                }
                break;
        }
    }
}
