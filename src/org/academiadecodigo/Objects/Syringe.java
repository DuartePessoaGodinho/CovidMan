package org.academiadecodigo.Objects;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Syringe {

    private Picture picture;
    private boolean used;

    public void isUsed(){
        used = true;
    }

    public void useSyring(GhostCovid ghost){
        if(!used){
            ghost.kill(); // falta definir metodo kill na class
        }
    }
}
