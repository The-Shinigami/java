package app.util;

public class SubCollectionType extends CollectionType  {
    boolean addSpeed;
    boolean deleteSpeed;
    boolean getSpeed;
    boolean memory;
    boolean sort;




    public SubCollectionType(String name, boolean keyValue, boolean order, boolean unique,boolean fifoLifo,boolean indexing) {
        super(name, keyValue,order, unique,fifoLifo,indexing);
    }

    public SubCollectionType(String name, boolean keyValue, boolean order, boolean unique,boolean fifoLifo,boolean indexing, boolean addSpeed, boolean deleteSpeed, boolean getSpeed, boolean memory,boolean sort) {
        super(name, keyValue, order, unique,fifoLifo,indexing);
        this.addSpeed = addSpeed;
        this.deleteSpeed = deleteSpeed;
        this.getSpeed = getSpeed;
        this.memory = memory;
        this.sort = sort;
    }

    public boolean getScoreA(SubCollectionType other) {
        int score = 0;

        if (this.keyValue == other.keyValue ) {
            score++;
        }


        if (this.fifoLifo == other.fifoLifo) {
            score++;
        }

        if (this.indexing == other.indexing) {
            score++;
        }

        if (this.sort  == other.sort) {
            score++;
        }

       

        return score == 4;
    }
    public int getScoreB(SubCollectionType other) {
        int score = 0;

        if (this.order && other.order) {
            score++;
        }

        if (this.addSpeed && other.addSpeed) {
            score++;
        }

        if (this.deleteSpeed && other.deleteSpeed) {
            score++;
        }

        if (this.getSpeed && other.getSpeed) {
            score++;
        }

        if (this.memory && other.memory) {
            score++;
        }


        if (this.unique && other.unique) {
            score++;
        }

        return score;
    }


}

