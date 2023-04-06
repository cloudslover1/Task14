package com.example.task14;

public class Player {
    private String name;

    private Integer count;

    public Integer prize;

    //lksjdalfksjadlf;kjs;ldfkjasldkfjsal;f
    private Integer number;


    public Player(String name, Integer number) {

        this.name = name;

        this.number = number;

        count=0;
        prize = 0;

    }


    public boolean pay(Integer number) {

        if ((number <= this.number) && (number != 0)) {

            this.number-=number;

            this.count++;

            return true;        }

        else return false;

    }


    public Integer getCount() {

        return count;

    }


    public Integer getNumber() {

        return number;

    }


    public void addNumber(Integer number) {

        this.number+= number;

    }

    public Integer getPrize(){
        return prize;
    }
    public void addPrize(Integer prize){
        this.prize = this.prize + prize;
    }
}
