package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.a.otp.EnterOtp;
import com.example.a.otp.Phone;

/**
 * Created by A on 17-03-2018.
 */

public class ViewAdapter extends FragmentStatePagerAdapter {
    int mnumoftabs;
    public ViewAdapter(FragmentManager fm, int numoftabs) {
        super(fm);
        this.mnumoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Phone tab1 = new Phone();
                return tab1;
            case 1:
                EnterOtp tab2 = new EnterOtp();
                return tab2;

                default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return mnumoftabs;
    }
}
