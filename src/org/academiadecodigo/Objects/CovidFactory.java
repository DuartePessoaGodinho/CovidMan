package org.academiadecodigo.Objects;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class CovidFactory {

    private int numberCovid = 5;
    private GhostCovid[] covids = new GhostCovid[numberCovid];
    private Picture covid;
    protected int col = 910;
    protected int row = 500;


    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public GhostCovid getCovid() {
        GhostCovid getCovid = null;
        for (int i = 0; i < covids.length; i++) {
            getCovid = covids[i];
        }
        return getCovid;
    }

    public GhostCovid[] covidFactory() throws InterruptedException {

        for (int i = 0; i < numberCovid; i++) {
            int randCol = ((int) Math.floor(Math.random()*950));
            int randRow = ((int) Math.floor(Math.random()*440));

            while(randCol % 25 != 0){
                randCol = ((int) Math.floor(Math.random()*950));
            }
            if(randCol % 25 == 0){
                col = randCol+10;
                System.out.println(" col "+col);
            }

            while(randRow % 25 != 0 || randRow < 50){
                randRow = ((int) Math.floor(Math.random()*440));
            }
            if (randRow % 25 == 0){
                row = randRow;
                System.out.println("row "+row);
            }
            covids[i] = new GhostCovid(col,row);
            covids[i].setInitialMove();
            col += 50;
        }
        return covids;
    }


}
