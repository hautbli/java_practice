public class Message extends Thread {

    Banghak k ;

    public void run (){
            try {
                Thread.sleep((int)(Math.random() * 10000));

            } catch (InterruptedException ignored) {

            }
            if (k.day % 2 == 0)
                 {
                    System.out.println("──────────────────────────────────────");
                    System.out.println();
                    System.out.println("       ● 등록금 납부 메세지 ●");
                    System.out.println();
                    System.out.println("    등록금 납부일이 " + -k.day + "일 남았습니다 ");
                    System.out.println("개강 1일전까지 납부하여 주시기 바랍니다. ");
                    System.out.println();
                    System.out.println("          00대학교 행정실");
                    System.out.println("──────────────────────────────────────");
                }

        }




    }

