package commands;

import app.*;
import data.HumanBeing;

/**
 * Show class
 */
public class Show implements Command {

    private final CollectionManager collectionManager;

    public Show(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args, HumanBeing object) {
        collectionManager.show();
    }

    @Override
    public String toString() {
        return "show - выводит все элементы коллекции в строковом представлении";
    }
}
