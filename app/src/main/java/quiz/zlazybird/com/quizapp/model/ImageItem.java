package quiz.zlazybird.com.quizapp.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by gom on 3/31/2017.
 */

public class ImageItem implements Image {

    private String name;
    private String description;
    private String path;

    public ImageItem() {
        super();
    }

    public ImageItem(String name, String description, String path) {
        super();
        this.name = name;
        this.description = description;
        this.path = path;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setPath(String path){
        this.path = path;
    }

    // Image interface
    @Override
    public String getTitle() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getPath() {
        return path;
    }

    @Override
    public String getThumbPath() {
        return null;
    }


    //PARECELABLE INTERFACE
    public ImageItem(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
        name = in.readString();
        description = in.readString();
        path = in.readString();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(description);
        dest.writeString(path);
    }

    @SuppressWarnings("rawtypes")
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public ImageItem createFromParcel(Parcel in) {
            return new ImageItem(in);
        }

        public ImageItem[] newArray(int size) {
            return new ImageItem[size];
        }
    };
}
