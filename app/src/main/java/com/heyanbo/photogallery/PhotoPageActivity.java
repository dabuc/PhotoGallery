package com.heyanbo.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by kaite on 2015/5/24.
 */
public class PhotoPageActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
