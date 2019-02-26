package BlackJack;

import java.util.List;

public class Cards {

    private String marks;
    private String numbers;
    private int points;

    public Cards() {
    }

    public String getMarks() {
        return marks;
    }

    public String getNumbers() {
        return numbers;
    }

    public int getPoints() {
        return points;
    }

    public void setMarks(String aCard) {
        int intCard = Integer.parseInt(aCard);
        if (intCard <= 13) {
            // \u2660: spades
            this.marks = "\u2660";
        } else if (intCard >= 14 && intCard <= 26) {
            // \u2665: hearts
            this.marks = "\u2665";
        } else if (intCard >= 27 && intCard <= 39) {
            // \u2666: diamonds
            this.marks = "\u2666";
        } else if (intCard >= 40 && intCard <= 52) {
            // \u2663: clubs
            this.marks = "\u2663";
        }
    }

    public void setNumber(String aCard) {
        int num = oneToThirteen(aCard);
        if (num == 1) {
            this.numbers = "A";
        } else if (num == 11) {
            this.numbers = "J";
        } else if (num == 12) {
            this.numbers = "Q";
        } else if (num == 13) {
            this.numbers = "K";
        } else {
            this.numbers = num + "";
        }
    }

    public void setPoints(String aCard) {
        int point = oneToThirteen(aCard);
        if (point == 1) {
            this.points = 11;
        } else if (point >= 10) {
            this.points = 10;
        } else {
            this.points = point;
        }
    }

    private int oneToThirteen(String aCard) {
        int intCard = Integer.parseInt(aCard);
        if (intCard >= 14 && intCard <= 26) {
            intCard -= 13;
        } else if (intCard >= 27 && intCard <= 39) {
            intCard -= 26;
        } else if (intCard >= 40 && intCard <= 52) {
            intCard -= 39;
        }
        return intCard;
    }

}
