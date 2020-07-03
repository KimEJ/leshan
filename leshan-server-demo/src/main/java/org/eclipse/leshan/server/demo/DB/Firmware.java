package org.eclipse.leshan.server.demo.DB;

public class Firmware {
    private String oldVer;
    private String newVer;
    private String ULI;
    private boolean success;

    public Firmware(String oldVer, String newVer, String ULI, boolean success){
        this.oldVer = oldVer;
        this.newVer = newVer;
        this.ULI = ULI;
        this.success = success;
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

    public boolean isSuccess() {
        return success;
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