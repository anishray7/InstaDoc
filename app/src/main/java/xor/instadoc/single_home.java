package xor.instadoc;

import android.widget.ImageView;

public class single_home {

    private String heading, headingInfo;
    private int headingImage;

    public single_home(String heading, String headingInfo, int headingImage) {
        this.heading = heading;
        this.headingInfo = headingInfo;
        this.headingImage = headingImage;
    }

    public String getHeading() {
        return heading;
    }

    public String getHeadingInfo() {
        return headingInfo;
    }

    public int getHeadingImage() {
        return headingImage;
    }
}
