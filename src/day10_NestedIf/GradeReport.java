package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 95;

        if (score>=0 && score<=100){
            if (score>=90 && score<=100){//score<=100 kismi fazlalik artik, yazmayabiliriz
                System.out.println("Excellent");
            } else if (score>=80 && score <=89) {//score<=89 kismi fazlalik yazmayabilriiz
                System.out.println("Great");

            } else if (score>=70 && score<=79) {//aynen yukaridaki gibi ikinci kisim fazlalik
                System.out.println("Good");
            } else if (score>=60 && score<=69) {//yukarinin aynisi
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        }else {
            System.out.println("Invalid Score");
        }



    }
}

/*
90~100 excellent
80~89 great
70~79 good
60~69 passed
0~59 failed
 */