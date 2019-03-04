package BlackJack;

class Card {

    private String suits;
    private String ranks;
    private int points;


    Card() {
    }


    String getSuits() {
        return suits;
    }

    String getRanks() {
        return ranks;
    }

    int getPoints() {
        return points;
    }

    void setSuits(String aCard) {
        int intCard = Integer.parseInt(aCard);
        if (intCard <= 13) {
            // \u2660: spades
            this.suits = "\u2660";
        } else if (intCard <= 26) {
            // \u2665: hearts
            this.suits = "\u2665";
        } else if (intCard <= 39) {
            // \u2666: diamonds
            this.suits = "\u2666";
        } else if (intCard <= 52) {
            // \u2663: clubs
            this.suits = "\u2663";
        }
    }

    void setRanks(String aCard) {
        int num = oneToThirteen(aCard);
        if (num == 1) {
            this.ranks = "A";
        } else if (num == 11) {
            this.ranks = "J";
        } else if (num == 12) {
            this.ranks = "Q";
        } else if (num == 13) {
            this.ranks = "K";
        } else {
            this.ranks = num + "";
        }
    }

    void setPoints(String aCard) {
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
