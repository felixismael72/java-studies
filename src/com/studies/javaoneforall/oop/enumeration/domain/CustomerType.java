package com.studies.javaoneforall.oop.enumeration.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2, "Company"),
    STARTUP(3, "Startup");

    public final int DB_VALUE;
    public final String REPORT_VALUE;

    CustomerType(int dbValue, String reportValue) {
        this.DB_VALUE = dbValue;
        this.REPORT_VALUE = reportValue;
    }

    public int getDB_VALUE() {
        return DB_VALUE;
    }

    public String getREPORT_VALUE() {
        return REPORT_VALUE;
    }
}
