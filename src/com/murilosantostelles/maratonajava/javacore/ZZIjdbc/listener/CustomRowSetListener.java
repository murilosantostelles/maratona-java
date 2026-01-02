package com.murilosantostelles.maratonajava.javacore.ZZIjdbc.listener;

import lombok.SneakyThrows;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

public class CustomRowSetListener implements RowSetListener {

    @Override
    public void rowSetChanged(RowSetEvent rowSetEvent) {
        System.out.println("Command execute triggered");
    }


    @Override
    public void rowChanged(RowSetEvent rowSetEvent) {
        System.out.println("Row inseterd, updated or deleted");
        if(rowSetEvent.getSource() instanceof RowSet){
            try {
                ((RowSet) rowSetEvent.getSource()).execute();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent rowSetEvent) {
        System.out.println("Cursor moved");
    }
}
