package xor.instadoc;

public class single_settings {

    private String settings,settingsInfo,divider;

    public single_settings(String settings, String settingsInfo,String divider) {
        this.settings = settings;
        this.settingsInfo = settingsInfo;
        this.divider=divider;
    }

    public String getSettings() {
        return settings;
    }

    public String getSettingsInfo() {
        return settingsInfo;
    }

    public String getDivider() {
        return divider;
    }
}
