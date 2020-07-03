package org.eclipse.leshan.server.demo.DB;

public class Firmware {
    private String oldVer;
    private String newVer;
    private String ULI;

    public Firmware(String oldVer, String newVer, String ULI){
        this.oldVer = oldVer;
        this.newVer = newVer;
        this.ULI = ULI;
    }

    public String getOldVer() {
        return oldVer;
    }

    public String getNewVer() {
        return newVer;
    }

    public String getULI() {
        return ULI;
    }

    public void setOldVer(String oldVer) {
        this.oldVer = oldVer;
    }

    public void setNewVer(String newVer) {
        this.newVer = newVer;
    }

    public void setULI(String ULI) {
        this.ULI = ULI;
    }
}