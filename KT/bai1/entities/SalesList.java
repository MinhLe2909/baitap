package Ontap.KT.bai1.entities;

import java.util.ArrayList;
import java.util.List;

public class SalesList {
    private SalesPerson salesperson;
    private List<Item> soldItems;

    public SalesList(SalesPerson salesperson) {
        this.salesperson = salesperson;
        this.soldItems = new ArrayList<>();
    }

    public SalesPerson getSalesperson() {
        return salesperson;
    }

    public List<Item> getSoldItems() {
        return soldItems;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Salesperson: " + salesperson.getName() + "\nItems sold:\n");
        for (Item item : soldItems) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }



}
