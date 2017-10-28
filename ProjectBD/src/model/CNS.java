/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author casca
 */
public class CNS {

    public CNS(ArrayList<RowCNS> rows) {
        this.rows = rows;
    }

    public ArrayList<RowCNS> getRows() {
        return rows;
    }

    public void setRows(ArrayList<RowCNS> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "CNS{" + "rows=" + rows + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.rows);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CNS other = (CNS) obj;
        if (!Objects.equals(this.rows, other.rows)) {
            return false;
        }
        return true;
    }
    
    ArrayList<RowCNS> rows;
}
