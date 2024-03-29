package za.ac.cput.domain;

import org.apache.maven.surefire.shade.org.apache.commons.lang3.builder.Builder;

import java.util.Locale;
/* Tables.Java
 *  Entity for Tables
 *  Author: Chulumanco Buhle Nkwindana (219390983)
 *  Date: 29 March 2022
 * */
public class Tables {
    private String tableID;
    private String tableStatus;
    private String capacity;
    public String tableType;

    public Tables(){

    }

    private Tables(TablesBuilder builder){

this.tableID=builder.tableID;
        this.tableStatus=builder.tableStatus;
        this.capacity=builder.capacity;
        this.tableType=builder.tableType;

    }

    public String getTableID() {
        return tableID;
    }

    public String getTableStatus() {
        return tableStatus;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getTableType() {
        return tableType;
    }

    @Override
    public String toString() {
        return "Tables{" +
                "tableID=" + tableID +
                ", tableStatus='" + tableStatus + '\'' +
                ", capacity=" + capacity +
                ", tableType='" + tableType + '\'' +
                '}';
    }

    public static class TablesBuilder {
        private String tableID;
        private String tableStatus;
        private String capacity;
        public String tableType;

        public TablesBuilder setTableID(String tableID) {
            this.tableID = tableID;
            return this;
        }

        public TablesBuilder setTableStatus(String tableStatus) {
            this.tableStatus = tableStatus;
            return this;
        }

        public TablesBuilder setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }

        public TablesBuilder setTableType(String tableType) {
            this.tableType = tableType;
            return this;
        }

        public Tables build() {
            return new Tables(this);
        }

        public TablesBuilder copy(Tables tables) {
            this.tableID = tables.tableID;
            this.tableStatus = tables.tableStatus;
            this.capacity = tables.capacity;
            this.tableType = tables.tableType;
            return this;
        }
    }
}
