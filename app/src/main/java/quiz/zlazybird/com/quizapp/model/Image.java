package quiz.zlazybird.com.quizapp.model;

import android.os.Parcelable;

/**
 * Created by gom on 3/31/2017.
 */

public interface Image extends Parcelable {

    public String getTitle();

    public String getDescription();

    public String getPath();

    public String getThumbPath();
}
