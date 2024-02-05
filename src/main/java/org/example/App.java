package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {

        System.out.println( "Entering start up" );

        List<Card> myListOfCardsPicked = new ArrayList<>();

        int sample = 1000000;

        for(int i=0; i<sample ; i++) {
            double randomNumber = Math.random();

            Card myCard = null;
            if(randomNumber<= 0.333333) {
                myCard = new Card(true, false, false);
            } else if(randomNumber<= 0.6666666) {
                myCard = new Card(false, true, false);
            } else {
                myCard = new Card(false, false, true);
            }
            myListOfCardsPicked.add(myCard);
        }

        int numTimesARedDotFacingYou = 0;
        int numTimesTwoRedDots = 0;

        for(Card myCard : myListOfCardsPicked) {
            if(myCard.hasRedDotOnASide()) {
                if(myCard.isRedDotEachSide()) {
                    numTimesTwoRedDots++;
                    numTimesARedDotFacingYou++;
                } else if(myCard.isBlackDotRedDotEachSide()) {
                    // did it come out with red dot facing you....50%
                    double coinFlip = Math.random();
                    if(coinFlip<0.5) {
                        numTimesARedDotFacingYou++;
                    }
                }
            }
        }

        double prob = numTimesTwoRedDots/(numTimesARedDotFacingYou+0.00001);

        System.out.println("prob="+prob);
    }


}
